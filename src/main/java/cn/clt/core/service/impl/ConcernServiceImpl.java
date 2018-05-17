package cn.clt.core.service.impl;

import cn.clt.core.entity.Concern;
import cn.clt.core.entity.ConcernExample;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.enums.ConcernCode;
import cn.clt.core.mapper.ConcernMapper;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.params.Pagination;
import cn.clt.core.service.ConcernService;
import cn.clt.core.utils.GuidUtil;
import cn.clt.core.vo.ConcernVO;
import cn.clt.core.vo.UserInfoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description ConcernServiceImpl
 * @Aouthor CLT
 * @Date 2018/05/03 15:02
 */
@Service
public class ConcernServiceImpl implements ConcernService{

    private static final Logger logger = LoggerFactory.getLogger(ConcernServiceImpl.class);

    @Autowired
    private ConcernMapper concernMapper;


    /**
     * @Title concernUser
     * @Description 关注操作
     * @Author CLT
     * @Date 2018/5/3 16:53
     * @param concernedUserId
     * @param concernUserId
     * @return
     */
    @Override
    public int concernUser(String concernedUserId, String concernUserId) {
        Concern concern = getConcern(concernedUserId,concernUserId);
        if (concern == null){
            //新增
            concern = new Concern();
            concern.setId(GuidUtil.newGuid());
            concern.setConcernUser(concernUserId);
            concern.setConcernedUser(concernedUserId);
            concern.setConcernType(1);
            concern.setStatus(1);
            concernMapper.insert(concern);
        }else {
            //编辑 查看当前的关注状态 0:无关注，1:已关注
            Integer concernType = concern.getConcernType();
            if (concernType == 0){
                //改成关注
                concern.setConcernType(1);
            }
            if (concernType == 1){
                //改成末关注
                concern.setConcernType(0);
            }
            concernMapper.updateByPrimaryKeySelective(concern);
        }
        return concern.getConcernType();
    }

    /**
     * @Title getConcern
     * @Description 获取关注关系
     * @Author CLT
     * @Date 2018/5/3 16:57
     * @param concernedUserId
     * @param concernUserId
     * @return
     */
    public Concern getConcern(String concernedUserId, String concernUserId){
        ConcernExample example = new ConcernExample();
        example.createCriteria().andConcernUserEqualTo(concernUserId).andConcernedUserEqualTo(concernedUserId)
                .andStatusEqualTo(1);
        List<Concern> concernList = concernMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(concernList)){
            return concernList.get(0);
        }
        return null;
    }

    /**
     * @Title countFansAndConcern
     * @Description 获取粉丝和关注个数
     * @Author CLT
     * @Date 2018/5/4 12:04
     * @param userId
     * @return
     */
    @Override
    public Map<String, Long> countFansAndConcern(String userId) {
        Map<String,Long> result = new HashMap<>();
        ConcernExample example = new ConcernExample();
        example.createCriteria().andConcernUserEqualTo(userId).andStatusEqualTo(1).andConcernTypeEqualTo(1);
        //关注个数
        Long concernCount = concernMapper.countByExample(example);
        //粉丝个数
        example.clear();
        example.createCriteria().andConcernedUserEqualTo(userId).andStatusEqualTo(1).andConcernTypeEqualTo(1);
        Long fansCount = concernMapper.countByExample(example);
        result.put("concernCount",concernCount);
        result.put("fansCount",fansCount);
        return result;
    }

    /**
     * @Title listFans
     * @Description 获取粉丝列表
     * @Author CLT
     * @Date 2018/5/4 16:57
     * @param userId
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public ManagementPageData selectFansPage(String userId,Integer pageNo, Integer pageSize) {
        Map<String,Object> params = new HashMap<>();
        Pagination pagination = new Pagination(pageNo,pageSize);
        params.put("pagination",pagination);
        params.put("userId",userId);
        //粉丝列表 分页
        List<UserInfoVO> userInfoVOList = concernMapper.listFans(params);
        //粉丝数量
        Long count = concernMapper.countFans(params);
        ManagementPageData managementPageData = new ManagementPageData();
        managementPageData.setFansList(userInfoVOList);
        managementPageData.setTotalCount(count);
        managementPageData.setPageNo(pageNo);
        managementPageData.setPageSize(pageSize);
        return managementPageData;
    }

    /**
     * @Title listConcern
     * @Description 获取关注列表
     * @Author CLT
     * @Date 2018/5/7 15:27
     * @param userId
     * @return
     */
    @Override
    public ManagementPageData selectConcernPage(String userId, Integer pageNo, Integer pageSize) {
        Map<String,Object> params = new HashMap<>();
        Pagination pagination = new Pagination(pageNo,pageSize);
        params.put("pagination",pagination);
        params.put("userId",userId);
        List<UserInfoVO> userInfoVOList = concernMapper.listConcern(params);
        //处理看下是否也同样被关注的话 就修改为互相关注的状态
        for (UserInfoVO userInfoVO : userInfoVOList) {
            Concern concern = getConcern(userId,userInfoVO.getConcernedUserId());
            if (concern != null) {
                if (concern.getStatus() == ConcernCode.CONCERN.getCode()) {
                    //修改状态 互相关注
                    userInfoVO.setConcernType(ConcernCode.MUTUAL_CONCERN.getCode());
                }
            }
        }
        Long cout = concernMapper.countConcern(params);
        ManagementPageData pageData = new ManagementPageData();
        if (!CollectionUtils.isEmpty(userInfoVOList)){
            pageData.setConcernList(userInfoVOList);
            pageData.setTotalCount(cout);
            pageData.setPageSize(pageSize);
            pageData.setPageNo(pageNo);
            return pageData;
        }
        return null;
    }

    /**
     * @Title cancelConcern
     * @Description 取消关注
     * @Author CLT
     * @Date 2018/5/8 17:50
     * @param concernUser 关注者
     * @param concernedUser 被关注者
     */
    @Override
    public int cancelConcern(String concernUser, String concernedUser) {
        Concern concern = getConcern(concernedUser,concernUser);
        if (concern != null){
            //更新为末关注状态与不可使用状态
            concern.setConcernType(0);
            concern.setStatus(0);
            return concernMapper.updateByPrimaryKeySelective(concern);
        }else {
            //不成功
            return 0;
        }
    }
}
