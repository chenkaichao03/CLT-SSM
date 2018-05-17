package cn.clt.core.service.impl;

import cn.clt.core.entity.GoodReview;
import cn.clt.core.entity.GoodReviewExample;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.mapper.GoodReviewMapper;
import cn.clt.core.service.GoodReviewService;
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
 * @Description GoodReviewServiceImpl
 * @Aouthor CLT
 * @Date 2018/05/16 12:05
 */
@Service
public class GoodReviewServiceImpl implements GoodReviewService{

    private static final Logger logger = LoggerFactory.getLogger(GoodReviewServiceImpl.class);
    @Autowired
    private GoodReviewMapper goodReviewMapper;
    @Autowired
    private UserInfoService userInfoService;

    /**
     * @Title insertGoodReview
     * @Description 新增评论好评
     * @Author CLT
     * @Date 2018/5/17 12:44
     * @param goodReview
     * @return
     */
    @Override
    public String insertGoodReview(GoodReview goodReview) {
        Date date = new Date();
        GoodReview goodReview1 = getGoodReview(goodReview.getReviewId(),goodReview.getGoodReviewUserId());
        if (goodReview1 == null){
            //新增
            goodReview.setId(GuidUtil.newGuid());
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(goodReview.getGoodReviewUserId());
            if (!CollectionUtils.isEmpty(userInfoList)){
                UserInfo userInfo = new UserInfo();
                goodReview.setGoodReviewUserName(userInfo.getRealName());
                goodReview.setGoodReviewUserPicture(userInfo.getUserPicture());
            }
            goodReview.setStatus(1);
            goodReview.setCreateTime(date);
            return goodReview.getId();
        }else {
            Integer status = goodReview1.getStatus();
            if (status == 0){
                goodReview1.setStatus(1);
                goodReview1.setCreateTime(date);
                goodReviewMapper.updateByPrimaryKeySelective(goodReview1);
            }else if (status == 1){
                goodReview1.setStatus(0);
                goodReview1.setCreateTime(date);
                goodReviewMapper.updateByPrimaryKeySelective(goodReview1);
            }
        }
        return goodReview1.getId();
    }

    /**
     * @Title getGoodReview
     * @Description 获取评论好评
     * @Author CLT
     * @Date 2018/5/17 12:49
     * @param reviewId
     * @param goodReviewUserId
     * @return
     */
    private GoodReview getGoodReview(String reviewId,String goodReviewUserId){
        GoodReviewExample example = new GoodReviewExample();
        example.createCriteria().andReviewIdEqualTo(reviewId).andGoodReviewUserIdEqualTo(goodReviewUserId).andStatusEqualTo(1);
        List<GoodReview> goodReviewList = goodReviewMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(goodReviewList)){
            return goodReviewList.get(0);
        }
        return null;
    }
}
