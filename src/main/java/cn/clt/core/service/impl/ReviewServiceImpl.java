package cn.clt.core.service.impl;

import cn.clt.core.entity.*;
import cn.clt.core.mapper.ArticleMapper;
import cn.clt.core.mapper.ReviewDetailMapper;
import cn.clt.core.mapper.ReviewMapper;
import cn.clt.core.mapper.UserAccountMapper;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.params.Pagination;
import cn.clt.core.service.*;
import cn.clt.core.utils.DateUtil;
import cn.clt.core.utils.GuidUtil;
import cn.clt.core.vo.ReviewVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.*;

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
    @Autowired
    private GoodReviewService goodReviewService;
    @Autowired
    private BadReviewService badReviewService;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private UserAccountService userAccountService;
    @Autowired
    private ReviewDetailService reviewDetailService;
    @Autowired
    private UserAccountMapper userAccountMapper;


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
        //更新用户账户评论数
        String articleUserId = updateUserAccountByReview(review.getArticleId());
        //更新账户余额表
        userAccountService.updateUserExchangeBalanceAccount(articleUserId);
        return review.getId();
    }

    /**
     * @Title updateUserAccountByReview
     * @Description 更新用户账户评论数
     * @Author CLT
     * @Date 2018/5/19 22:04
     * @param articleId
     */
    private String updateUserAccountByReview(String articleId){
        Article article = articleMapper.selectByPrimaryKey(articleId);
        UserAccount userAccount = userAccountService.getUserAccountByUserId(article.getCreateUserId());
        Integer totalCurrentComment = userAccount.getUserTotalComment();
        if (totalCurrentComment < 0){
            return article.getCreateUserId();
        }
        totalCurrentComment = totalCurrentComment + 1;
        userAccount.setUserTotalComment(totalCurrentComment);
        userAccountService.updateUserAccount(userAccount);
        return article.getCreateUserId();
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
    public ManagementPageData listReview(String articleId,Integer pageNo, Integer pageSize) {
        return getReviews(articleId,pageNo,pageSize);
    }

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
    @Override
    public ManagementPageData listReviewComment(String userId, Integer pageNo, Integer pageSize) {
        Map<String,Object> params = new HashMap<>();
        Pagination pagination = new Pagination(pageNo,pageSize);
        //获取用户下的文章id
        List<String> articleIds = getArticleIds(userId);
        params.put("pagination",pagination);
        params.put("articleIds",articleIds);
        List<ReviewVO> reviewVOList = reviewMapper.listReviewVo(params);
        if (!CollectionUtils.isEmpty(reviewVOList)) {
            for (ReviewVO reviewVO : reviewVOList) {
                //处理日期
                String createTimeStr = DateUtil.formatDate(DateUtil.DATE_FORMATS[0], reviewVO.getCreateTime());
                reviewVO.setCreateTimeStr(createTimeStr);
                //处理点赞数
                Long goodReview = goodReviewService.countGoodReview(reviewVO.getArticleId(), reviewVO.getId());
                reviewVO.setCountFabulous(goodReview.intValue());
                //获取评论下的点评和回复个数
                Integer countReviewDetail = reviewDetailService.countReviewDetail(reviewVO.getArticleId(), reviewVO.getId());
                reviewVO.setCountReview(countReviewDetail);
            }
        }
        Long count = reviewMapper.countReviewVo(params);
        ManagementPageData pageData = new ManagementPageData();
        pageData.setReviewVOList(reviewVOList);
        pageData.setTotalCount(count);
        pageData.setPageNo(pageNo);
        pageData.setPageSize(pageSize);
        return pageData;
    }

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
    @Override
    public ManagementPageData selectReviewCommentPage(String userId, Integer pageNo, Integer pageSize) {
        Map<String,Object> params = new HashMap<>();
        Pagination pagination = new Pagination(pageNo,pageSize);
        params.put("userId",userId);
        params.put("pagination",pagination);
        List<ReviewVO> reviewList = reviewMapper.listReviewPage(params);
        if (!CollectionUtils.isEmpty(reviewList)){
            for (ReviewVO review : reviewList){
                String createTimeStr = DateUtil.formatDate(DateUtil.DATE_FORMATS[0],review.getCreateTime());
                review.setCreateTimeStr(createTimeStr);
            }
        }
        Long count = reviewMapper.countReviewPage(params);
        ManagementPageData pageData = new ManagementPageData();
        pageData.setReviewVOList(reviewList);
        pageData.setTotalCount(count);
        pageData.setPageNo(pageNo);
        pageData.setPageSize(pageSize);
        return pageData;
    }

    /**
     * @Title deleteReview
     * @Description 删除评论
     * @Author CLT
     * @Date 2018/5/21 17:07
     * @param id
     * @return
     */
    @Override
    public Integer deleteReview(String id) {
        //更新评论为不可用状态
        Review review = reviewMapper.selectByPrimaryKey(id);
        review.setStatus(0);
        reviewMapper.updateByPrimaryKeySelective(review);
        if (review == null){
            return 0;
        }
        Article article = articleMapper.selectByPrimaryKey(review.getArticleId());
        if (article == null){
            return 0;
        }
        UserAccount userAccount = userAccountService.getUserAccountByUserId(article.getCreateUserId());
        if (userAccount == null){
            UserAccount userAccount1 = AssembleUserAccount(review.getReviewUserId());
            return 0;
        }
        //获取评论数
        Integer userTotalComment = userAccount.getUserTotalComment();
        if (userTotalComment <= 0){
            return 0;
        }
        userTotalComment = userTotalComment - 1;
        userAccount.setUserTotalComment(userTotalComment);
        return userAccountService.updateUserAccount(userAccount);
    }

    /**
     * @Title AssembleUserAccount
     * @Description 新增用户账户信息 登录初始化
     * @Author CLT
     * @Date 2018/5/20 22:25
     * @param userId
     * @return
     */
    private UserAccount AssembleUserAccount(String userId){
        Date date = new Date();
        UserAccount userAccount = new UserAccount();
        userAccount.setId(GuidUtil.newGuid());
        userAccount.setUserId(userId);
        userAccount.setUserAmoutMoney(BigDecimal.ZERO);
        userAccount.setUserTotalConcern(0);
        userAccount.setUserTotalFans(0);
        userAccount.setUserTotalBrowse(0);
        userAccount.setUserTotalComment(0);
        userAccount.setUserTotalIntegral(BigDecimal.ZERO);
        userAccount.setUserTotalConsume(BigDecimal.ZERO);
        userAccount.setUserTotalRecharge(BigDecimal.ZERO);
        userAccount.setUserTotalFabulous(0);
        userAccount.setStatus(1);
        userAccount.setCreateTime(date);
        userAccount.setModifyTime(date);
        userAccountMapper.insert(userAccount);
        return userAccount;
    }

    /**
     * @Title getArticleIds
     * @Description 根据用户id获取用户下的所有文章id
     * @Author CLT
     * @Date 2018/5/21 10:49
     * @param userId
     * @return
     */
    private List<String> getArticleIds(String userId){
        List<String> articleIds = new LinkedList<>();
        ArticleExample example = new ArticleExample();
        example.createCriteria().andCreateUserIdEqualTo(userId).andStatusEqualTo(1);
        List<Article> articleList = articleMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(articleList)){
            for (Article article : articleList){
               articleIds.add(article.getId());
            }
        }
        return articleIds;
    }

    /**
     * @Title getReviews
     * @Description 获取评论内容(三级 评论 点评 回复)
     * @Author CLT
     * @Date 2018/5/17 11:19
     * @param articleId
     * @return
     */
    private ManagementPageData getReviews(String articleId, Integer pageNo, Integer pageSize){
        Pagination pagination = new Pagination(pageNo,pageSize);
        Map<String,Object> params = new HashMap<>();
        params.put("articleId",articleId);
        params.put("pagination",pagination);
        List<Review> reviewList = reviewMapper.listReview(params);
        Long count = reviewMapper.countReview(params);
        if (!CollectionUtils.isEmpty(reviewList)){
            //获取点评
            for (Review review : reviewList){
                String id = review.getId();
                //获取评论的好评数
                Long countGoodReview = goodReviewService.countGoodReview(review.getArticleId(),id);
                review.setCountGoodReview(countGoodReview);
                //获取评论的差评数
                Long countBadReview = badReviewService.countBadReview(review.getArticleId(),id);
                review.setCountBadReview(countBadReview);
                //时间转换 天数
                review.setDayDifferent(DateUtil.getDayDifference(System.currentTimeMillis(),review.getCreateTime().getTime()));
                review.setTimeDifference(DateUtil.getTimeDifference(System.currentTimeMillis(),review.getCreateTime().getTime()));
                List<ReviewDetail> reviewDetailList = getReviewDetails(id,null);
                if (!CollectionUtils.isEmpty(reviewDetailList)){
                    for (ReviewDetail reviewDetail : reviewDetailList){
                        //时间转换 天数
                        reviewDetail.setDayDifferent(DateUtil.getDayDifference(System.currentTimeMillis(),reviewDetail.getCreateTime().getTime()));
                        reviewDetail.setTimeDifference(DateUtil.getTimeDifference(System.currentTimeMillis(),review.getCreateTime().getTime()));
                        String reviewDetailId = reviewDetail.getId();
                        String reviewId = reviewDetail.getReviewId();
                        //获取点评的子评论
                        List<ReviewDetail> reviewDetails = getReviewDetails(reviewId,reviewDetailId);
                        if (!CollectionUtils.isEmpty(reviewDetails)){
                            for (ReviewDetail reviewDetail1 : reviewDetails){
                                //时间转换 天数
                                reviewDetail1.setDayDifferent(DateUtil.getDayDifference(System.currentTimeMillis(),reviewDetail1.getCreateTime().getTime()));
                                reviewDetail1.setTimeDifference(DateUtil.getTimeDifference(System.currentTimeMillis(),review.getCreateTime().getTime()));
                            }
                            reviewDetail.setReviewDetails(reviewDetails);
                        }
                    }
                    review.setReviewDetailList(reviewDetailList);
                }
            }
        }
        ManagementPageData managementPageData = new ManagementPageData();
        managementPageData.setReviewList(reviewList);
        managementPageData.setTotalCount(count);
        managementPageData.setPageNo(pageNo);
        managementPageData.setPageSize(pageSize);
        return managementPageData;
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
                example.createCriteria().andReviewIdEqualTo(reviewId).andParentReviewIdIsNull().andStatusEqualTo(1);
            }
        }else {
            if (!StringUtils.isEmpty(reviewId)) {
                example.createCriteria().andReviewIdEqualTo(reviewId).andParentReviewIdEqualTo(parentReviewId).andStatusEqualTo(1);
            }
        }
        List<ReviewDetail> reviewDetailList = reviewDetailMapper.selectByExampleWithBLOBs(example);
        if (!CollectionUtils.isEmpty(reviewDetailList)){
            return reviewDetailList;
        }
        return null;
    }
}
