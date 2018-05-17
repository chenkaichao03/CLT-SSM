package cn.clt.core.service.impl;

import cn.clt.core.entity.*;
import cn.clt.core.enums.ExchangeTypeCode;
import cn.clt.core.mapper.ExchangeSettingMapper;
import cn.clt.core.mapper.UserMapper;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.params.Pagination;
import cn.clt.core.service.ExchangeSettingService;
import cn.clt.core.service.UserExchangeService;
import cn.clt.core.utils.GuidUtil;
import cn.clt.core.vo.UserProfitVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Description ExchangeSettingServiceImpl
 * @Aouthor CLT
 * @Date 2018/05/09 17:38
 */
@Service
public class ExchangeSettingServiceImpl implements ExchangeSettingService {

    private static final Logger logger = LoggerFactory.getLogger(ExchangeSettingServiceImpl.class);
    @Autowired
    private ExchangeSettingMapper exchangeSettingMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserExchangeService userExchangeService;

    /**
     * @Title listExchangeSetting
     * @Description 获取兑换设置
     * @Author CLT
     * @Date 2018/5/9 18:12
     * @param role
     * @return
     */
    @Override
    public List<ExchangeSetting> listExchangeSetting(String role) {
        List<String> exchangeTypeCodeList = new LinkedList<>();
        for (ExchangeTypeCode exchangeTypeCode : ExchangeTypeCode.values()){
            exchangeTypeCodeList.add(exchangeTypeCode.name());
        }
        //通过角色名称获取用户
        User user = getUserByRoleName(role);
        if (user != null){
            String userId = user.getId();
            //通过id获取管理员创建的所有兑换设置
            List<ExchangeSetting> exchangeSettingList = getExchangeSettings(exchangeTypeCodeList,userId);
            if (!CollectionUtils.isEmpty(exchangeSettingList)){
                return exchangeSettingList;
            }
        }
        return null;
    }

    /**
     * @Title exchangeSetting
     * @Description 兑换设置
     * @Author CLT
     * @Date 2018/5/9 17:47
     * @param exchangeSetting
     * @return
     */
    @Override
    public String exchangeSetting(ExchangeSetting exchangeSetting) {
        Date date = new Date();
        String id = exchangeSetting.getId();
        if (StringUtils.isEmpty(id)){
            //新增
            exchangeSetting.setId(GuidUtil.newGuid());
            //获取兑换类型名称
            String exchangeTypeName = ExchangeTypeCode.getExchangeTypeName(exchangeSetting.getExchangeType());
            exchangeSetting.setExchangeTypeName(exchangeTypeName);
            exchangeSetting.setStatus(1);
            exchangeSetting.setCreateTime(date);
            exchangeSetting.setModifyTime(date);
            exchangeSettingMapper.insert(exchangeSetting);
            return exchangeSetting.getId();
        }else {
            //编辑
            exchangeSetting.setModifyTime(date);
            exchangeSettingMapper.updateByPrimaryKeySelective(exchangeSetting);
            return exchangeSetting.getId();
        }
    }

    /**
     * @Title selectPageUserExchange
     * @Description 获取用户兑换列表
     * @Author CLT
     * @Date 2018/5/10 14:07
     * @param userId
     * @param exchangeType
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public ManagementPageData selectPageUserExchange(String userId, String exchangeType, Integer pageNo, Integer pageSize) {
        Pagination pagination = new Pagination(pageNo,pageSize);
        Map<String,Object> params = new HashMap<>();
        params.put("userId",userId);
        params.put("exchangeType",exchangeType);
        params.put("pagination",pagination);
        //兑换列表
        List<UserExchange> userExchangeList = userExchangeService.listUserExchange(params);
        //获取兑换次数
        Long count = userExchangeService.countUserExchange(params);
        ManagementPageData pageData = new ManagementPageData();
        pageData.setUserExchangeList(userExchangeList);
        pageData.setTotalCount(count);
        pageData.setPageNo(pageNo);
        pageData.setPageSize(pageSize);
        return pageData;
    }

    /**
     * @Title getUserProfit
     * @Description 用户累计收益汇总
     * @Author CLT
     * @Date 2018/5/10 14:56
     * @param userExchangeList
     * @return
     */
    @Override
    public UserProfitVO getUserProfit(List<UserExchange> userExchangeList) {
        if (CollectionUtils.isEmpty(userExchangeList)){
            return null;
        }
        BigDecimal totalAmountNumber = BigDecimal.ZERO;
        BigDecimal totalAmountMoney = BigDecimal.ZERO;
        for (UserExchange userExchange : userExchangeList){
            totalAmountMoney = totalAmountMoney.add(userExchange.getExchangeAmountMoney()).setScale(2,BigDecimal.ROUND_HALF_UP);
            totalAmountNumber = totalAmountNumber.add(userExchange.getExchangeAmountNumber()).setScale(2,BigDecimal.ROUND_HALF_UP);
        }
        return new UserProfitVO(totalAmountMoney,totalAmountNumber);
    }


    /**
     * @Title getExchangeSettingById
     * @Description 通过id获取兑换设置
     * @Author CLT
     * @Date 2018/5/11 16:21
     * @param id
     * @return
     */
    @Override
    public ExchangeSetting getExchangeSettingById(String id) {
        ExchangeSettingExample example = new ExchangeSettingExample();
        example.createCriteria().andIdEqualTo(id).andStatusEqualTo(1);
        List<ExchangeSetting> exchangeSettingList = exchangeSettingMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(exchangeSettingList)){
            return exchangeSettingList.get(0);
        }
        return null;
    }

    /**
     * @Title getUserByRoleName
     * @Description 根据角色名获取用户
     * @Author CLT
     * @Date 2018/5/9 18:14
     * @param role
     * @return
     */
    private User getUserByRoleName(String role){
        UserExample example = new UserExample();
        example.createCriteria().andRoleEqualTo(role).andStatusEqualTo(1);
        List<User> userList = userMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userList)){
            return userList.get(0);
        }
        return null;
    }

    /**
     * @Title getExchangeSettings
     * @Description 获取所有管理员创建的兑换设置
     * @Author CLT
     * @Date 2018/5/10 9:34
     * @param exchangeTypeCodeList
     * @param userId
     * @return
     */
    private List<ExchangeSetting> getExchangeSettings(List<String> exchangeTypeCodeList ,String userId){
        ExchangeSettingExample example = new ExchangeSettingExample();
        example.createCriteria().andCreateUserIdEqualTo(userId).andExchangeTypeIn(exchangeTypeCodeList)
                .andStatusEqualTo(1);
        List<ExchangeSetting> exchangeSettingList = exchangeSettingMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(exchangeSettingList)){
            return exchangeSettingList;
        }
        return null;
    }
}
