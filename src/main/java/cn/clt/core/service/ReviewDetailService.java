package cn.clt.core.service;

import cn.clt.core.entity.ReviewDetail;
import cn.clt.core.params.ManagementPageData;

/**
 * @Description ReviewDetailService
 * @Aouthor CLT
 * @Date 2018/05/16 11:39
 */
public interface ReviewDetailService {

    /**
     * @Title insertReviewDetail
     * @Description 新增评论详情
     * @Author CLT
     * @Date 2018/5/17 10:17
     * @param reviewDetail
     * @return
     */
    String insertReviewDetail(ReviewDetail reviewDetail);


    /**
     * @Title countReviewDetail
     * @Description 获取每篇文章评论下的点评和回复个数.
     * @Author CLT
     * @Date 2018/5/21 11:10
     * @param articleId
     * @param reviewId
     * @return
     */
    Integer countReviewDetail(String articleId,String reviewId);


    /**
     * @Title countReviewDetailByParentId
     * @Description 根据父id获取子评论也就是回复
     * @Author CLT
     * @Date 2018/5/21 11:16
     * @param parentId
     * @return
     */
    Long countReviewDetailByParentId(String parentId);

    /**
     * @Title selectReviewDetailPage
     * @Description 获取该用户的点评
     * @Author CLT
     * @Date 2018/5/21 15:49
     * @param userId
     * @param pageNo
     * @param pageSize
     * @return
     */
    ManagementPageData selectReviewDetailPage(String userId, Integer pageNo, Integer pageSize);
}
