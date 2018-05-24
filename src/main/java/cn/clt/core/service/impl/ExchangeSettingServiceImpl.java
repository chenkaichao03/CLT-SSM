package cn.clt.core.service.impl;

import cn.clt.core.entity.*;
import cn.clt.core.enums.ExchangeTypeCode;
import cn.clt.core.mapper.ExchangeSettingMapper;
import cn.clt.core.mapper.UserMapper;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.params.Pagination;
import cn.clt.core.params.Result;
import cn.clt.core.service.*;
import cn.clt.core.utils.GuidUtil;
import cn.clt.core.vo.ExchangeOperationVO;
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
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserAccountService userAccountService;
    @Autowired
    private UserExchangeBalanceAccountService userExchangeBalanceAccountService;

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
        for (UserExchange userExchange : userExchangeList){
            String exchangeRateMoney = toPrettyNumber(userExchange.getExchangeRateMoney());
            userExchange.setExchangeRateMoney(new BigDecimal(exchangeRateMoney));
            String exchangeRateNumber = toPrettyNumber(userExchange.getExchangeRateNumber());
            userExchange.setExchangeRateNumber(new BigDecimal(exchangeRateNumber));
        }
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
     * 数据格式化
     * @param content
     * @return
     */
    public static String toPrettyNumber(BigDecimal content) {
        if (content == null) {
            return "0";
        }
        long contentLong = content.multiply(new BigDecimal(1000)).longValue();
        int xs1 = (int) (contentLong % 1000) / 100;
        int xs2 = (int) (contentLong % 100) / 10;
        int xs3 = (int) (contentLong % 10);
        if (xs3 >= 5) {
            xs2 += 1;
        }
        boolean hasXs = false;
        if (xs1 != 0 || xs2 != 0) {
            hasXs = true;
        }
        return contentLong / 1000 + (hasXs ? "." + (xs2 == 0 ? String.valueOf(xs1) : String.valueOf(xs1) + xs2) : "");
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
     * @Title checkExchangeOperation
     * @Description 检查兑换操作的余额
     * @Author CLT
     * @Date 2018/5/21 18:16
     * @param exchangeOperationVO
     * @return
     */
    @Override
    public String checkExchangeOperation(ExchangeOperationVO exchangeOperationVO) {
        //当前兑换数量
        Integer exchangeNumber = exchangeOperationVO.getExchangeNumber();
        if (StringUtils.isEmpty(exchangeOperationVO.getExchangeSettingId())){
            return Result.error("该兑换规则不存在,请联系管理员");
        }
        if (StringUtils.isEmpty(exchangeOperationVO.getUserId())){
            return Result.error("用户id不能为空，请登录后进行兑换.");
        }
        //获取兑换类型
        ExchangeSetting exchangeSetting = exchangeSettingMapper.selectByPrimaryKey(exchangeOperationVO.getExchangeSettingId());
        String exchangeType = exchangeSetting.getExchangeType();
        //获取用户余额表
        UserExchangeBalanceAccount userExchangeBalanceAccount = userExchangeBalanceAccountService.getUserExchangeBalanceAccount(exchangeOperationVO.getUserId());
        if (exchangeType.equals(ExchangeTypeCode.BROWSE.name())){
            //浏览量
            Integer userTotalBrowse = userExchangeBalanceAccount.getBrowseAfterBalance();
            if (userTotalBrowse == null || userTotalBrowse <= 0 || userTotalBrowse < exchangeNumber){
                return Result.error("当前浏览量兑换余额不足.");
            }
        }else if (exchangeType.equals(ExchangeTypeCode.COMMENT.name())){
            //评论量
            Integer userTotalComment = userExchangeBalanceAccount.getCommentAfterBalance();
            if (userTotalComment == null || userTotalComment <= 0 || userTotalComment < exchangeNumber){
                return Result.error("当前评论量兑换余额不足.");
            }
        }else if (exchangeType.equals(ExchangeTypeCode.FABULOUS.name())){
            //点赞数
            Integer userTotalFabulous = userExchangeBalanceAccount.getFabulousAfterBalance();
            if (userTotalFabulous == null || userTotalFabulous <= 0 || userTotalFabulous < exchangeNumber){
                return Result.error("当前点赞量兑换余额不足.");
            }
        }else if (exchangeType.equals(ExchangeTypeCode.FANS.name())){
            //粉丝数
            Integer userTotalFans = userExchangeBalanceAccount.getFansAfterBalance();
            if (userTotalFans == null || userTotalFans <= 0 || userTotalFans <exchangeNumber){
                return Result.error("当前粉丝量兑换余额不足.");
            }
        }
        return null;
    }

    /**
     * @Title doExchangeOperation
     * @Description 用户兑换操作
     * @Author CLT
     * @Date 2018/5/21 18:05
     * @param userId
     * @param exchangeSettingId
     */
    @Override
    public int doExchangeOperation(String userId, String exchangeSettingId, Integer exchangeNumber) {
        //获取用户信息
        List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
        if (CollectionUtils.isEmpty(userInfoList)){
            return 0;
        }
        UserInfo userInfo = userInfoList.get(0);
        if (userInfo == null){
            return 0;
        }
        //获取兑换设置
        ExchangeSetting exchangeSetting = exchangeSettingMapper.selectByPrimaryKey(exchangeSettingId);
        //获取用户余额表
        UserExchangeBalanceAccount userExchangeBalanceAccount = userExchangeBalanceAccountService.getUserExchangeBalanceAccount(userId);
        //用户兑换记录
        UserExchange userExchange = insertUserExchange(userInfo,exchangeSetting,exchangeNumber);
        //处理用户兑换过程
        return updateUserExchangeBalanceAccount(userExchangeBalanceAccount,exchangeSetting,exchangeNumber);
    }


    /**
     * @Title updateUserExchangeBalanceAccount
     * @Description 更新账户信息
     * @Author CLT
     * @Date 2018/5/22 11:00
     * @param userExchangeBalanceAccount
     * @param exchangeSetting
     * @param exchangeNumber
     * @return
     */
    private int updateUserExchangeBalanceAccount(UserExchangeBalanceAccount userExchangeBalanceAccount,ExchangeSetting exchangeSetting,Integer exchangeNumber){
        String exchangeType = exchangeSetting.getExchangeType();
        if (exchangeType.equals(ExchangeTypeCode.FANS.name())){
            //粉丝兑换
            Integer fansExchangeNum = exchangeNumber + userExchangeBalanceAccount.getFansExchangeNumber();
            userExchangeBalanceAccount.setFansExchangeNumber(fansExchangeNum);
            Integer fansAfterBalance = userExchangeBalanceAccount.getFansAfterBalance();
            fansAfterBalance = fansAfterBalance - exchangeNumber;
            userExchangeBalanceAccount.setFansAfterBalance(fansAfterBalance);
            return userExchangeBalanceAccountService.updateUserExchangeBalanceAccount(userExchangeBalanceAccount);
        }else if (exchangeType.equals(ExchangeTypeCode.COMMENT.name())){
            //评论
            Integer commentExchangeNum = exchangeNumber + userExchangeBalanceAccount.getCommentExchangeNumber();
            userExchangeBalanceAccount.setCommentExchangeNumber(commentExchangeNum);
            Integer commentAfterBalance = userExchangeBalanceAccount.getCommentAfterBalance();
            commentAfterBalance = commentAfterBalance - exchangeNumber;
            userExchangeBalanceAccount.setCommentAfterBalance(commentAfterBalance);
            return userExchangeBalanceAccountService.updateUserExchangeBalanceAccount(userExchangeBalanceAccount);
        }else if (exchangeType.equals(ExchangeTypeCode.FABULOUS.name())){
            //点赞数
            Integer fabulousExchangeNum = exchangeNumber + userExchangeBalanceAccount.getFabulousExchangeNumber();
            userExchangeBalanceAccount.setFabulousExchangeNumber(fabulousExchangeNum);
            Integer fabulousAfterBalance = userExchangeBalanceAccount.getFabulousAfterBalance();
            fabulousAfterBalance = fabulousAfterBalance - exchangeNumber;
            userExchangeBalanceAccount.setFabulousAfterBalance(fabulousAfterBalance);
            return userExchangeBalanceAccountService.updateUserExchangeBalanceAccount(userExchangeBalanceAccount);
        }else if (exchangeType.equals(ExchangeTypeCode.BROWSE.name())){
            //浏览量
            Integer browseExchangeNum = exchangeNumber + userExchangeBalanceAccount.getBrowseExchangeNumber();
            userExchangeBalanceAccount.setBrowseExchangeNumber(browseExchangeNum);
            Integer browseAfterBalance = userExchangeBalanceAccount.getBrowseAfterBalance();
            browseAfterBalance = browseAfterBalance - exchangeNumber;
            userExchangeBalanceAccount.setBrowseAfterBalance(browseAfterBalance);
            return userExchangeBalanceAccountService.updateUserExchangeBalanceAccount(userExchangeBalanceAccount);
        }
        return 0;
    }

    /**
     * @Title insertUserExchange
     * @Description 新增用户兑换记录
     * @Author CLT
     * @Date 2018/5/21 19:05
     * @param userInfo
     * @param exchangeSetting
     * @param exchangeNumber
     * @return
     */
    private UserExchange insertUserExchange(UserInfo userInfo,ExchangeSetting exchangeSetting,Integer exchangeNumber){
        Date date = new Date();
        BigDecimal exchangeNum = new BigDecimal(exchangeNumber);
        BigDecimal exchangeRateNumber = new BigDecimal(exchangeSetting.getExchangeRateNumber());
        BigDecimal exchangeRateMoney = new BigDecimal(exchangeSetting.getExchangeRateMoney());
        //获取用户
        User user = userMapper.selectByPrimaryKey(userInfo.getUserId());
        //组装兑换记录
        UserExchange userExchange = new UserExchange();
        userExchange.setId(GuidUtil.newGuid());
        userExchange.setUserId(userInfo.getUserId());
        userExchange.setUserNo(userInfo.getUserNo());
        userExchange.setUserName(user.getUserName());
        userExchange.setUserRealName(userInfo.getRealName());
        userExchange.setUserPhone(userInfo.getUserPhone());
        userExchange.setExchangeType(exchangeSetting.getExchangeType());
        userExchange.setExchangeTypeName(exchangeSetting.getExchangeTypeName());
        userExchange.setExchangeRateNumber(exchangeRateNumber);
        userExchange.setExchangeRateMoney(exchangeRateMoney);
        userExchange.setExchangeAmountNumber(exchangeNum);
        //根据比例算出兑换后的价格
        BigDecimal exchangeAmountMoney = exchangeNum.divide(exchangeRateNumber).multiply(exchangeRateMoney).setScale(2,BigDecimal.ROUND_HALF_UP);
        userExchange.setExchangeAmountMoney(exchangeAmountMoney);
        userExchange.setStatus(1);
        userExchange.setCreateTime(date);
        userExchange.setModifyTime(date);
        userExchangeService.insertUserExchange(userExchange);
        //更新账户余额
        UserAccount userAccount = userAccountService.getUserAccountByUserId(userInfo.getUserId());
        BigDecimal amoutMoney = userAccount.getUserAmoutMoney();
        BigDecimal currentAmountMoney = amoutMoney.add(exchangeAmountMoney).setScale(2,BigDecimal.ROUND_HALF_UP);
        userAccount.setUserAmoutMoney(currentAmountMoney);
        userAccountService.updateUserAccount(userAccount);
        return userExchange;
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
