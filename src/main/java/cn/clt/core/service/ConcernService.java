package cn.clt.core.service;

import cn.clt.core.entity.Concern;
import cn.clt.core.entity.User;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.vo.ConcernVO;
import cn.clt.core.vo.UserInfoVO;

import java.util.List;
import java.util.Map;

/**
 * @Description ConcernService
 * @Aouthor CLT
 * @Date 2018/05/03 15:01
 */
public interface ConcernService {

    /**
     * @Title concernUser
     * @Description 关注操作
     * @Author CLT
     * @Date 2018/5/3 16:53
     * @param concernedUserId
     * @param concernUserId
     * @return
     */
    int concernUser(String concernedUserId,String concernUserId);

    /**
     * @Title getConcern
     * @Description 获取关注关系
     * @Author CLT
     * @Date 2018/5/3 16:57
     * @param concernedUserId
     * @param concernUserId
     * @return
     */
    Concern getConcern(String concernedUserId, String concernUserId);

    /**
     * @Title countFansAndConcern
     * @Description 获取粉丝和关注个数
     * @Author CLT
     * @Date 2018/5/4 12:04
     * @param userId
     * @return
     */
    Map<String,Long> countFansAndConcern(String userId);

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
    ManagementPageData selectFansPage(String userId, Integer pageNo, Integer pageSize);


    /**
     * @Title listConcern
     * @Description 获取关注列表
     * @Author CLT
     * @Date 2018/5/7 15:27
     * @param userId
     * @return
     */
    ManagementPageData selectConcernPage(String userId, Integer pageNo, Integer pageSize);

    /**
     * @Title cancelConcern
     * @Description 取消关注
     * @Author CLT
     * @Date 2018/5/8 17:50
     * @param concernUser 关注者
     * @param concernedUser 被关注者
     */
    int cancelConcern(String concernUser, String concernedUser);
}
