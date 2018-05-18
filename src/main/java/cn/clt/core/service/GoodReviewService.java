package cn.clt.core.service;

import cn.clt.core.entity.GoodReview;

/**
 * @Description GoodReviewService
 * @Aouthor CLT
 * @Date 2018/05/16 12:04
 */
public interface GoodReviewService {

    /**
     * @Title insertGoodReview
     * @Description 新增评论好评
     * @Author CLT
     * @Date 2018/5/17 12:44
     * @param goodReview
     * @return
     */
    String insertGoodReview(GoodReview goodReview);

    /**
     * @Title countGoodReview
     * @Description 获取文章评论对应的好评数
     * @Author CLT
     * @Date 2018/5/18 0:58
     * @param articleId
     * @param reviewId
     * @return
     */
    Long countGoodReview(String articleId,String reviewId);
}
