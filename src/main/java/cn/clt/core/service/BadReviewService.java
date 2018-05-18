package cn.clt.core.service;

import cn.clt.core.entity.BadReview;

/**
 * @Description BadReviewService
 * @Aouthor CLT
 * @Date 2018/05/16 12:06
 */
public interface BadReviewService {

    /**
     * @Title insertBadReview
     * @Description 新增差评
     * @Author CLT
     * @Date 2018/5/17 12:58
     * @param badReview
     * @return
     */
    String insertBadReview(BadReview badReview);

    /**
     * @Title countBadReview
     * @Description 获取文章评论对应的差评数
     * @Author CLT
     * @Date 2018/5/18 1:02
     * @param articleId
     * @param reviewId
     * @return
     */
    Long countBadReview(String articleId,String reviewId);
}
