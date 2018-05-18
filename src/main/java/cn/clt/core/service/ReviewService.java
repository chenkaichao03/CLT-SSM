package cn.clt.core.service;

import cn.clt.core.entity.Review;
import cn.clt.core.params.ManagementPageData;

/**
 * @Description ReviewService
 * @Aouthor CLT
 * @Date 2018/05/16 11:39
 */
public interface ReviewService {

    /**
     * @Title insertReview
     * @Description 新增文章评论
     * @Author CLT
     * @Date 2018/5/17 9:48
     * @param review
     * @return
     */
    String insertReview(Review review);

    /**
     * @Title countReview
     * @Description 获取评论条数
     * @Author CLT
     * @Date 2018/5/17 10:05
     * @param articleId
     * @return
     */
    Long countReview(String articleId);


    /**
     * @Title listReview
     * @Description 获取评论内容
     * @Author CLT
     * @Date 2018/5/17 11:18
     * @param articleId
     * @return
     */
    ManagementPageData listReview(String articleId, Integer pageNo, Integer pageSize);


}
