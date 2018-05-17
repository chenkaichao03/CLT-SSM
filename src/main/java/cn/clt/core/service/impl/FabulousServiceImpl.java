package cn.clt.core.service.impl;

import cn.clt.core.entity.Fabulous;
import cn.clt.core.entity.FabulousExample;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.mapper.FabulousMapper;
import cn.clt.core.mapper.UserInfoMapper;
import cn.clt.core.service.FabulousService;
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
 * @Description FabulousServiceImpl
 * @Aouthor CLT
 * @Date 2018/05/16 18:13
 */
@Service
public class FabulousServiceImpl implements FabulousService {

    private static final Logger logger = LoggerFactory.getLogger(FabulousServiceImpl.class);

    @Autowired
    private FabulousMapper fabulousMapper;
    @Autowired
    private UserInfoService userInfoService;


    /**
     * @Title doFabulous
     * @Description 点赞操作
     * @Author CLT
     * @Date 2018/5/16 18:15
     * @param fabulous
     * @return
     */
    @Override
    public String doFabulous(Fabulous fabulous) {
        Date date = new Date();
        Fabulous fabulous1 = getFabulousByArticleIdAndUserId(fabulous.getArticleId(),fabulous.getFabulousUserId());
        if (fabulous1 == null){
            fabulous.setId(GuidUtil.newGuid());
            List<UserInfo> userInfoList= userInfoService.listUserInfoByUsreId(fabulous.getFabulousUserId());
            if (!CollectionUtils.isEmpty(userInfoList)){
                UserInfo userInfo = userInfoList.get(0);
                fabulous.setFabulousUserName(userInfo.getRealName());
                fabulous.setFabulousUserPicture(userInfo.getUserPicture());
            }
            fabulous.setStatus(1);
            fabulous.setCareateTime(date);
            fabulousMapper.insert(fabulous);
            return fabulous.getId();
        }else {
            //判断状态
            Integer status = fabulous1.getStatus();
            if (status == 1){
                fabulous1.setStatus(0);
                fabulous1.setCareateTime(date);
                fabulousMapper.updateByPrimaryKeySelective(fabulous1);
                return fabulous1.getId();
            }else if (status == 0){
                fabulous1.setStatus(1);
                fabulous1.setCareateTime(date);
                fabulousMapper.updateByPrimaryKeySelective(fabulous1);
                return fabulous1.getId();
            }
        }
        return null;
    }

    /**
     * @Title getFabulousByArticleIdAndUserId
     * @Description 通过文章id和用户id获取点赞信息(用于判断状态)
     * @Author CLT
     * @Date 2018/5/16 22:04
     * @param articleId
     * @param userId
     * @return
     */
    @Override
    public Fabulous getFabulousByArticleIdAndUserId(String articleId, String userId) {
        FabulousExample example = new FabulousExample();
        example.createCriteria().andArticleIdEqualTo(articleId).andFabulousUserIdEqualTo(userId);
        List<Fabulous> fabulousList = fabulousMapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(fabulousList)){
            return fabulousList.get(0);
        }
        return null;
    }

    /**
     * @Title totalFabulous
     * @Description 获取文章的点赞个数
     * @Author CLT
     * @Date 2018/5/16 23:08
     * @param articleId
     * @return
     */
    @Override
    public Long totalFabulous(String articleId) {
        FabulousExample example = new FabulousExample();
        example.createCriteria().andArticleIdEqualTo(articleId).andStatusEqualTo(1);
        return fabulousMapper.countByExample(example);
    }
}
