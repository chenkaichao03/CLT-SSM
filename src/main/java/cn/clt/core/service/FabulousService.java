package cn.clt.core.service;

import cn.clt.core.entity.Fabulous;

/**
 * @Description FabulousService
 * @Aouthor CLT
 * @Date 2018/05/16 18:13
 */
public interface FabulousService {

    /**
     * @Title doFabulous
     * @Description 点赞操作
     * @Author CLT
     * @Date 2018/5/16 18:15
     * @param fabulous
     * @return
     */
    String doFabulous(Fabulous fabulous);

    /**
     * @Title getFabulousByArticleIdAndUserId
     * @Description 通过文章id和用户id获取点赞信息(用于判断状态)
     * @Author CLT
     * @Date 2018/5/16 22:04
     * @param articleId
     * @param userId
     * @return
     */
    Fabulous getFabulousByArticleIdAndUserId(String articleId,String userId);

    /**
     * @Title totalFabulous
     * @Description 获取文章的点赞个数
     * @Author CLT
     * @Date 2018/5/16 23:08
     * @param articleId
     * @return
     */
    Long totalFabulous(String articleId);
}
