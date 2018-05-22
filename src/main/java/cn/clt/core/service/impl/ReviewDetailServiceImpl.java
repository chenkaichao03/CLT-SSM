package cn.clt.core.service.impl;

import cn.clt.core.entity.ReviewDetail;
import cn.clt.core.entity.ReviewDetailExample;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.mapper.ReviewDetailMapper;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.params.Pagination;
import cn.clt.core.service.ReviewDetailService;
import cn.clt.core.service.UserInfoService;
import cn.clt.core.utils.DateUtil;
import cn.clt.core.utils.GuidUtil;
import cn.clt.core.vo.ReviewDetalVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description ReviewDetailServiceImpl
 * @Aouthor CLT
 * @Date 2018/05/16 11:39
 */
@Service
public class ReviewDetailServiceImpl implements ReviewDetailService {

    private static final Logger logger = LoggerFactory.getLogger(ReviewDetailServiceImpl.class);
    @Autowired
    private ReviewDetailMapper reviewDetailMapper;
    @Autowired
    private UserInfoService userInfoService;

    /**
     * @Title insertReviewDetail
     * @Description 新增评论详情
     * @Author CLT
     * @Date 2018/5/17 10:17
     * @param reviewDetail
     * @return
     */
    @Override
    public String insertReviewDetail(ReviewDetail reviewDetail) {
        String id  = reviewDetail.getId();
        if (StringUtils.isEmpty(id)){
            //新增
            reviewDetail.setId(GuidUtil.newGuid());
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(reviewDetail.getReviewUserId());
            if (!CollectionUtils.isEmpty(userInfoList)){
                UserInfo userInfo = userInfoList.get(0);
                reviewDetail.setReviewUserName(userInfo.getRealName());
                reviewDetail.setReviewUserPicture(userInfo.getUserPicture());
            }
            reviewDetail.setStatus(1);
            reviewDetail.setCreateTime(new Date());
            reviewDetailMapper.insert(reviewDetail);
        }
        return reviewDetail.getId();
    }

    /**
     * @Title countReviewDetail
     * @Description 获取每篇文章评论下的点评和回复个数.
     * @Author CLT
     * @Date 2018/5/21 11:10
     * @param articleId
     * @param reviewId
     * @return
     */
    @Override
    public Integer countReviewDetail(String articleId, String reviewId) {
        ReviewDetailExample example = new ReviewDetailExample();
        example.createCriteria().andArticleIdEqualTo(articleId).andReviewIdEqualTo(reviewId).andStatusEqualTo(1);
        Long sum = reviewDetailMapper.countByExample(example);
        return sum.intValue();
    }

    /**
     * @Title countReviewDetailByParentId
     * @Description 根据父id获取子评论也就是回复
     * @Author CLT
     * @Date 2018/5/21 11:16
     * @param parentId
     * @return
     */
    @Override
    public Long countReviewDetailByParentId(String parentId) {
        ReviewDetailExample example = new ReviewDetailExample();
        example.createCriteria().andParentReviewIdEqualTo(parentId).andStatusEqualTo(1);
        return reviewDetailMapper.countByExample(example);
    }

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
    @Override
    public ManagementPageData selectReviewDetailPage(String userId, Integer pageNo, Integer pageSize) {
        Map<String,Object> params = new HashMap<>();
        Pagination pagination = new Pagination(pageNo,pageSize);
        params.put("userId",userId);
        params.put("pagination",pagination);
        List<ReviewDetalVO> reviewDetalVOList = reviewDetailMapper.listReviewDetailPage(params);
        if (!CollectionUtils.isEmpty(reviewDetalVOList)){
            for (ReviewDetalVO reviewDetalVO : reviewDetalVOList){
                //处理日期
                String createTimeStr = DateUtil.formatDate(DateUtil.DATE_FORMATS[0],reviewDetalVO.getCreateTime());
                reviewDetalVO.setCreateTimeStr(createTimeStr);
            }
        }
        Long count = reviewDetailMapper.countReviewDetailPage(params);
        ManagementPageData pageData = new ManagementPageData();
        pageData.setReviewDetalVOS(reviewDetalVOList);
        pageData.setTotalCount(count);
        pageData.setPageNo(pageNo);
        pageData.setPageSize(pageSize);
        return pageData;
    }
}
