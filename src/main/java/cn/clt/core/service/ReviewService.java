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


    /**
     * @Title listReviewComment
     * @Description 获取评论内容 （一级 评论）
     * @Author CLT
     * @Date 2018/5/21 10:22
     * @param userId
     * @param pageNo
     * @param pageSize
     * @return
     */
    ManagementPageData listReviewComment(String userId, Integer pageNo, Integer pageSize);

    /**
     * @Title selectReviewCommentPage
     * @Description 获取某用户的评论 分页
     * @Author CLT
     * @Date 2018/5/21 15:28
     * @param userId
     * @param pageNo
     * @param pageSize
     * @return
     */
    ManagementPageData selectReviewCommentPage(String userId, Integer pageNo, Integer pageSize);

    /**
     * @Title deleteReview
     * @Description 删除评论
     * @Author CLT
     * @Date 2018/5/21 17:07
     * @param id
     * @return
     */
    Integer deleteReview(String id);
}
