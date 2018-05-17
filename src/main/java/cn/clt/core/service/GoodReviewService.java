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
}
