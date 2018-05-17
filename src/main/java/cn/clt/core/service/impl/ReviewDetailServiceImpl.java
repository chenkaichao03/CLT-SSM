package cn.clt.core.service.impl;

import cn.clt.core.entity.ReviewDetail;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.mapper.ReviewDetailMapper;
import cn.clt.core.service.ReviewDetailService;
import cn.clt.core.service.UserInfoService;
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
}
