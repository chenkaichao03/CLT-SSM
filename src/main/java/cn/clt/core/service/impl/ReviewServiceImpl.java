package cn.clt.core.service.impl;

import cn.clt.core.entity.*;
import cn.clt.core.mapper.ReviewDetailMapper;
import cn.clt.core.mapper.ReviewMapper;
import cn.clt.core.service.ReviewService;
import cn.clt.core.service.UserInfoService;
import cn.clt.core.utils.DateUtil;
import cn.clt.core.utils.GuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @Description ReviewServiceImpl
 * @Aouthor CLT
 * @Date 2018/05/16 11:39
 */
@Service
public class ReviewServiceImpl implements ReviewService {

    private static final Logger logger = LoggerFactory.getLogger(ReviewServiceImpl.class);

    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private ReviewMapper reviewMapper;
    @Autowired
    private ReviewDetailMapper reviewDetailMapper;


    /**
     * @Title insertReview
     * @Description 新增文章评论
     * @Author CLT
     * @Date 2018/5/17 9:48
     * @param review
     * @return
     */
    @Override
    public String insertReview(Review review) {
        String id = review.getId();
        if (StringUtils.isEmpty(id)){
            //新增
            review.setId(GuidUtil.newGuid());
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(review.getReviewUserId());
            if (!CollectionUtils.isEmpty(userInfoList)){
                UserInfo userInfo = userInfoList.get(0);
                review.setReviewUserName(userInfo.getRealName());
                review.setReviewUserPicture(userInfo.getUserPicture());
            }
            review.setStatus(1);
            review.setCreateTime(new Date());
            reviewMapper.insert(review);
        }
        return review.getId();
    }

    /**
     * @Title countReview
     * @Description 获取评论条数
     * @Author CLT
     * @Date 2018/5/17 10:05
     * @param articleId
     * @return
     */
    @Override
    public Long countReview(String articleId) {
        ReviewExample example = new ReviewExample();
        example.createCriteria().andArticleIdEqualTo(articleId).andStatusEqualTo(1);
        return reviewMapper.countByExample(example);
    }

    /**
     * @Title listReview
     * @Description 获取评论内容
     * @Author CLT
     * @Date 2018/5/17 11:18
     * @param articleId
     * @return
     */
    @Override
    public List<Review> listReview(String articleId) {
        return getReviews(articleId);
    }

    /**
     * @Title getReviews
     * @Description 获取评论内容
     * @Author CLT
     * @Date 2018/5/17 11:19
     * @param articleId
     * @return
     */
    private List<Review> getReviews(String articleId){
        ReviewExample example = new ReviewExample();
        example.createCriteria().andArticleIdEqualTo(articleId).andStatusEqualTo(1);
        List<Review> reviewList = reviewMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(reviewList)){
            //获取点评
            for (Review review : reviewList){
                //时间转换 天数
                review.setDayDifferent(DateUtil.getDayDifference(System.currentTimeMillis(),review.getCreateTime().getTime()));
                String id = review.getId();
                List<ReviewDetail> reviewDetailList = getReviewDetails(id,null);
                if (!CollectionUtils.isEmpty(reviewDetailList)){
                    for (ReviewDetail reviewDetail : reviewDetailList){
                        //时间转换 天数
                        reviewDetail.setDayDifferent(DateUtil.getDayDifference(System.currentTimeMillis(),reviewDetail.getCreateTime().getTime()));
                        String reviewDetailId = reviewDetail.getId();
                        //获取点评的子评论
                        List<ReviewDetail> reviewDetails = getReviewDetails(null,reviewDetailId);
                        if (!CollectionUtils.isEmpty(reviewDetails)){
                            for (ReviewDetail reviewDetail1 : reviewDetails){
                                //时间转换 天数
                                reviewDetail1.setDayDifferent(DateUtil.getDayDifference(System.currentTimeMillis(),reviewDetail1.getCreateTime().getTime()));
                            }
                            reviewDetail.setReviewDetails(reviewDetails);
                        }
                    }
                    review.setReviewDetailList(reviewDetailList);
                }
            }
        }
        return reviewList;
    }

    /**
     * @Title getReviewDetails
     * @Description 获取评论详情
     * @Author CLT
     * @Date 2018/5/17 11:22
     * @param reviewId
     * @param parentReviewId
     * @return
     */
    private List<ReviewDetail> getReviewDetails(String reviewId,String parentReviewId){
        ReviewDetailExample example = new ReviewDetailExample();
        if (StringUtils.isEmpty(parentReviewId)){
            if (!StringUtils.isEmpty(reviewId)) {
                example.createCriteria().andReviewIdEqualTo(reviewId).andStatusEqualTo(1);
            }
        }else {
            if (StringUtils.isEmpty(reviewId)) {
                example.createCriteria().andParentReviewIdEqualTo(parentReviewId).andStatusEqualTo(1);
            }
        }
        List<ReviewDetail> reviewDetailList = reviewDetailMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(reviewDetailList)){
            return reviewDetailList;
        }
        return null;
    }
}
