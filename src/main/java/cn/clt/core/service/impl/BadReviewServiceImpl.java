package cn.clt.core.service.impl;

import cn.clt.core.entity.BadReview;
import cn.clt.core.entity.BadReviewExample;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.mapper.BadReviewMapper;
import cn.clt.core.service.BadReviewService;
import cn.clt.core.service.UserInfoService;
import cn.clt.core.utils.GuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * @Description BadReviewServiceImpl
 * @Aouthor CLT
 * @Date 2018/05/16 12:06
 */
@Service
public class BadReviewServiceImpl implements BadReviewService {

    private static final Logger logger = LoggerFactory.getLogger(BadReviewServiceImpl.class);
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private BadReviewMapper badReviewMapper;

    /**
     * @Title insertBadReview
     * @Description 新增差评
     * @Author CLT
     * @Date 2018/5/17 12:58
     * @param badReview
     * @return
     */
    @Override
    public String insertBadReview(BadReview badReview){
        Date date = new Date();
        BadReview badReview1 = getBadReview(badReview.getReviewId(),badReview.getBadReviewUserId());
        if (badReview1 == null){
            //新增
            badReview.setId(GuidUtil.newGuid());
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(badReview.getBadReviewUserId());
            if (!CollectionUtils.isEmpty(userInfoList)) {
                UserInfo userInfo = userInfoList.get(0);
                badReview.setBadReviewUserName(userInfo.getRealName());
                badReview.setBadReviewUserPicture(userInfo.getUserPicture());
            }
            badReview.setStatus(1);
            badReview.setCreateTime(date);
            badReviewMapper.insert(badReview);
            return badReview.getId();
        }else {
            Integer status = badReview1.getStatus();
            if (status == 0){
                badReview1.setStatus(1);
                badReview1.setCreateTime(date);
                badReviewMapper.updateByPrimaryKeySelective(badReview1);
            }else if (status == 1){
                badReview1.setStatus(0);
                badReview1.setCreateTime(date);
                badReviewMapper.updateByPrimaryKeySelective(badReview1);
            }
        }
        return badReview1.getId();
    }

    /**
     * @Title countBadReview
     * @Description 获取文章评论对应的差评数
     * @Author CLT
     * @Date 2018/5/18 1:02
     * @param articleId
     * @param reviewId
     * @return
     */
    @Override
    public Long countBadReview(String articleId, String reviewId) {
        BadReviewExample example = new BadReviewExample();
        example.createCriteria().andArticleIdEqualTo(articleId).andReviewIdEqualTo(reviewId).andStatusEqualTo(1);
        return badReviewMapper.countByExample(example);
    }

    /**
     * @Title getBadReview
     * @Description 获取评论差评
     * @Author CLT
     * @Date 2018/5/17 13:00
     * @param reviewId
     * @param badReviewUserId
     * @return
     */
    private BadReview getBadReview(String reviewId,String badReviewUserId){
        BadReviewExample example = new BadReviewExample();
        example.createCriteria().andReviewIdEqualTo(reviewId).andBadReviewUserIdEqualTo(badReviewUserId).andStatusEqualTo(1);
        List<BadReview> badReviewList = badReviewMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(badReviewList)){
            return badReviewList.get(0);
        }
        return null;
    }
}
