package cn.clt.core.service.impl;

import cn.clt.core.entity.*;
import cn.clt.core.enums.ExchangeTypeCode;
import cn.clt.core.mapper.*;
import cn.clt.core.service.UserAccountService;
import cn.clt.core.service.UserExchangeBalanceAccountService;
import cn.clt.core.utils.GuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description UserAccountServiceImpl
 * @Aouthor CLT
 * @Date 2018/05/19 15:16
 */
@Service
public class UserAccountServiceImpl implements UserAccountService{

    private static final Logger logger = LoggerFactory.getLogger(UserAccountServiceImpl.class);
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private FabulousMapper fabulousMapper;
    @Autowired
    private UserAccountMapper userAccountMapper;
    @Autowired
    private ReviewMapper reviewMapper;
    @Autowired
    private AccessStatisticsMapper accessStatisticsMapper;
    @Autowired
    private UserExchangeBalanceAccountService userExchangeBalanceAccountService;


    /**
     * @Title getUserAccountByUserId
     * @Description 根据用户id获取账户信息
     * @Author CLT
     * @Date 2018/5/19 15:50
     * @param userId
     * @return
     */
    @Override
    public UserAccount getUserAccountByUserId(String userId) {
        UserAccountExample example = new UserAccountExample();
        example.createCriteria().andUserIdEqualTo(userId).andStatusEqualTo(1);
        List<UserAccount> userAccountList = userAccountMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userAccountList)){
            return userAccountList.get(0);
        }
        return null;
    }

    /**
     * @Title updateUserAccount
     * @Description 更新账户信息
     * @Author CLT
     * @Date 2018/5/19 21:39
     * @param userAccount
     * @return
     */
    @Override
    public Integer updateUserAccount(UserAccount userAccount) {
        return userAccountMapper.updateByPrimaryKeySelective(userAccount);
    }

    /**
     * @Title statisticsUserAccount
     * @Description 统计所有用户账户的浏览量
     * @Author CLT
     * @Date 2018/5/19 15:20
     * @return
     */
    @Override
    public Integer statisticsUserAccount() {
        //获取所有的用户id
        List<String> userIds = getUserIds();
        if (CollectionUtils.isEmpty(userIds)){
            //不存在用户
            logger.info("不存在用户.");
            return 0;
        }
        for (String userId : userIds){
            //获取用户账户表信息
            UserAccount userAccount = getUserAccountByUserId(userId);
            if (userAccount == null){
                //创建一个用户账户
                userAccount = assembleUserAccount(userId);
            }
            //获取用户下的可用文章ids
            List<String> articleIds = getArticleIds(userId);
            //判断type是属于用户账户里的哪种类型的统计
            if (CollectionUtils.isEmpty(articleIds)){
                continue;
            }
            //浏览量统计
            Integer countBrowse = countBrowse(articleIds);
            userAccount.setUserTotalBrowse(countBrowse);
            userAccountMapper.updateByPrimaryKeySelective(userAccount);
        }
        return 1;
    }

    /**
     * @Title statisticsUserExchangeBalanceAccount
     * @Description 统计所有用户的账户余额
     * @Author CLT
     * @Date 2018/5/23 14:59
     * @return
     */
    @Override
    public Integer statisticsUserExchangeBalanceAccount() {
        List<String> userIds = getUserIds();
        if (CollectionUtils.isEmpty(userIds)){
            //不存在用户
            logger.info("不存在用户.");
            return 0;
        }
        for (String userId : userIds){
            updateUserExchangeBalanceAccount(userId);
        }
        return 1;
    }

    /**
     * @Title updateUserExchangeBalanceAccount
     * @Description 更新账户余额表
     * @Author CLT
     * @Date 2018/5/22 11:06
     * @param userId
     * @return
     */
    @Override
    public String updateUserExchangeBalanceAccount(String userId) {
        UserAccount userAccount = getUserAccountByUserId(userId);
        if (userAccount == null){
            userAccount = assembleUserAccount(userId);
        }
        UserExchangeBalanceAccount userExchangeBalanceAccount = userExchangeBalanceAccountService.getUserExchangeBalanceAccount(userId);
        if (userExchangeBalanceAccount == null){
            //新建
            return  AssembleUserExchangeBalanceAccount(userId,userAccount);
        }else {
            //更新
            return updateUserExchangeBalanceAccount(userExchangeBalanceAccount,userAccount);
        }
    }

    /**
     * @Title updateUserExchangeBalanceAccount
     * @Description 更新账户余额表
     * @Author CLT
     * @Date 2018/5/22 17:55
     * @param userExchangeBalanceAccount
     * @param userAccount
     * @return
     */
    public String updateUserExchangeBalanceAccount(UserExchangeBalanceAccount userExchangeBalanceAccount,UserAccount userAccount){
        //粉丝
        Integer currentFans = userAccount.getUserTotalFans();
        userExchangeBalanceAccount.setFansBeforeBalance(currentFans);//更新最新的兑换前值
        Integer fansExchangeNum = userExchangeBalanceAccount.getFansExchangeNumber();
        if (fansExchangeNum > 0) {
            Integer fansAfterBalance = currentFans - fansExchangeNum;
            userExchangeBalanceAccount.setFansAfterBalance(fansAfterBalance);
        }else if (fansExchangeNum == 0){
            userExchangeBalanceAccount.setFansAfterBalance(currentFans);
        }
        //评论
        Integer currentComment = userAccount.getUserTotalComment();
        userExchangeBalanceAccount.setCommentBeforeBalance(currentComment);
        Integer commentExchangeNum = userExchangeBalanceAccount.getCommentExchangeNumber();
        if (commentExchangeNum > 0){
            Integer commentAfterBalance = currentComment - commentExchangeNum;
            userExchangeBalanceAccount.setCommentAfterBalance(commentAfterBalance);
        }else if (commentExchangeNum == 0){
            userExchangeBalanceAccount.setCommentAfterBalance(currentComment);
        }
        //点赞数
        Integer currentFabulous = userAccount.getUserTotalFabulous();
        userExchangeBalanceAccount.setFabulousBeforeBalance(currentFabulous);
        Integer fabulousExchangeNum = userExchangeBalanceAccount.getFabulousExchangeNumber();
        if (fabulousExchangeNum > 0) {
            Integer fabulousAfterBalance = currentFabulous - fabulousExchangeNum;
            userExchangeBalanceAccount.setFabulousAfterBalance(fabulousAfterBalance);
        }else if (fabulousExchangeNum == 0){
            userExchangeBalanceAccount.setFabulousAfterBalance(currentFabulous);
        }
        //浏览量
        Integer currentBrowse = userAccount.getUserTotalBrowse();
        userExchangeBalanceAccount.setBrowseBeforeBalance(currentBrowse);
        Integer browseExchangeNum = userExchangeBalanceAccount.getBrowseExchangeNumber();
        if (browseExchangeNum > 0) {
            Integer browseAfterBalance = currentBrowse - browseExchangeNum;
            userExchangeBalanceAccount.setBrowseAfterBalance(browseAfterBalance);
        }else if (browseExchangeNum == 0){
            userExchangeBalanceAccount.setBrowseAfterBalance(currentBrowse);
        }
        userExchangeBalanceAccountService.updateUserExchangeBalanceAccount(userExchangeBalanceAccount);
        return userExchangeBalanceAccount.getId();
    }



    private String AssembleUserExchangeBalanceAccount(String userId,UserAccount userAccount){
        UserExchangeBalanceAccount userExchangeBalanceAccount = new UserExchangeBalanceAccount();
        userExchangeBalanceAccount.setId(GuidUtil.newGuid());
        userExchangeBalanceAccount.setUserId(userId);
        userExchangeBalanceAccount.setFansExchangeNumber(0);
        userExchangeBalanceAccount.setFansBeforeBalance(userAccount.getUserTotalFans());
        userExchangeBalanceAccount.setFansAfterBalance(userAccount.getUserTotalFans());
        userExchangeBalanceAccount.setBrowseExchangeNumber(0);
        userExchangeBalanceAccount.setBrowseBeforeBalance(userAccount.getUserTotalBrowse());
        userExchangeBalanceAccount.setBrowseAfterBalance(userAccount.getUserTotalBrowse());
        userExchangeBalanceAccount.setFabulousExchangeNumber(0);
        userExchangeBalanceAccount.setFabulousBeforeBalance(userAccount.getUserTotalFabulous());
        userExchangeBalanceAccount.setFabulousAfterBalance(userAccount.getUserTotalFabulous());
        userExchangeBalanceAccount.setCommentExchangeNumber(0);
        userExchangeBalanceAccount.setCommentBeforeBalance(userAccount.getUserTotalComment());
        userExchangeBalanceAccount.setCommentAfterBalance(userAccount.getUserTotalComment());
        userExchangeBalanceAccount.setStatus(1);
        userExchangeBalanceAccount.setCreateTime(new Date());
        userExchangeBalanceAccountService.insertUserExchangeBalanceAccount(userExchangeBalanceAccount);
        return userExchangeBalanceAccount.getId();
    }

    /**
     * @Title statisticsUserAccountByUserId
     * @Description 统计某个用户账户下的文章浏览量
     * @Author CLT
     * @Date 2018/5/20 22:13
     * @param userId
     * @return
     */
    @Override
    public Integer statisticsUserAccountByUserId(String userId) {
        //获取该用户的账户
        UserAccount userAccount = getUserAccountByUserId(userId);
        if (userAccount == null){
            UserAccount userAccount1 = assembleUserAccount(userId);
            //获取该用户下的所有文章id
            List<String> articleIds = getArticleIds(userId);
            if (CollectionUtils.isEmpty(articleIds)){
                System.out.println("-------------------------没有文章，所有没有统计文章浏览量的必要--------------------------------");
                return 0;
            }
            //浏览量统计
            Integer countBrowse = countBrowse(articleIds);
            userAccount1.setUserTotalBrowse(countBrowse);
            return userAccountMapper.updateByPrimaryKeySelective(userAccount1);
        }else {
            //获取该用户下的所有文章id
            List<String> articleIds = getArticleIds(userId);
            if (CollectionUtils.isEmpty(articleIds)){
                System.out.println("-------------------------没有文章，所有没有统计文章浏览量的必要--------------------------------");
                return 0;
            }
            //浏览量统计
            Integer countBrowse = countBrowse(articleIds);
            userAccount.setUserTotalBrowse(countBrowse);
            return userAccountMapper.updateByPrimaryKeySelective(userAccount);
        }
    }

    /**
     * @Title statisticsUserAccountBrowseSum
     * @Description 统计某一个用户账户的浏览数
     * @Author CLT
     * @Date 2018/5/21 9:45
     * @param userId
     * @return
     */
    @Override
    public Integer statisticsUserAccountBrowseSum(String userId) {
        //获取该用户的账户
        UserAccount userAccount = getUserAccountByUserId(userId);
        if (userAccount == null){
            UserAccount userAccount1 = assembleUserAccount(userId);
            //获取该用户下的所有文章id
            List<String> articleIds = getArticleIds(userId);
            if (CollectionUtils.isEmpty(articleIds)){
                System.out.println("-------------------------没有文章，所有没有统计文章浏览量的必要--------------------------------");
                return 0;
            }
            //浏览量统计
            Integer countBrowse = countBrowse(articleIds);
            return countBrowse;
        }else {
            //获取该用户下的所有文章id
            List<String> articleIds = getArticleIds(userId);
            if (CollectionUtils.isEmpty(articleIds)){
                System.out.println("-------------------------没有文章，所有没有统计文章浏览量的必要--------------------------------");
                return 0;
            }
            //浏览量统计
            Integer countBrowse = countBrowse(articleIds);
            return countBrowse;
        }
    }

    /**
     * @Title AssembleUserAccount
     * @Description 新增用户账户信息 登录初始化
     * @Author CLT
     * @Date 2018/5/20 22:25
     * @param userId
     * @return
     */
    private UserAccount assembleUserAccount(String userId){
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
     * @Title countBrowse
     * @Description 统计用户所有发布的文章的浏览量
     * @Author CLT
     * @Date 2018/5/19 16:30
     * @param articleIds
     * @return
     */
    private Integer countBrowse(List<String> articleIds){
        Integer sumVisit = 0;
        AccessStatisticsExample example = new AccessStatisticsExample();
        example.createCriteria().andArticleIdIn(articleIds);
        List<AccessStatistics> accessStatisticsList = accessStatisticsMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(accessStatisticsList)){
            for (AccessStatistics accessStatistics : accessStatisticsList){
                //循环获取访问的次数
                Integer currentVisit = accessStatistics.getVisitCount();
                sumVisit = sumVisit + currentVisit;
            }
        }
        return sumVisit;
    }

    /**
     * @Title countReview
     * @Description 统计用户所有发布的文章的评论数
     * @Author CLT
     * @Date 2018/5/19 16:25
     * @param articleIds
     * @return
     */
    private Long countReview(List<String> articleIds){
        ReviewExample example = new ReviewExample();
        example.createCriteria().andArticleIdIn(articleIds).andStatusEqualTo(1);
        return reviewMapper.countByExample(example);
    }

    /**
     * @Title countFabulous
     * @Description 统计用户所有发布的文章的点赞数
     * @Author CLT
     * @Date 2018/5/19 15:44
     * @param articleIds
     * @return
     */
    private Long countFabulous(List<String> articleIds){
        FabulousExample example = new FabulousExample();
        example.createCriteria().andArticleIdIn(articleIds).andStatusEqualTo(1);
        return fabulousMapper.countByExample(example);
    }



    /**
     * @Title getArticleIds
     * @Description 获取用户下的所有可用文章ids
     * @Author CLT
     * @Date 2018/5/19 15:31
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
     * @Title listUser
     * @Description 获取所有可用的用户
     * @Author CLT
     * @Date 2018/5/19 15:24
     * @return
     */
    private List<String> getUserIds(){
        List<String> userIds = new LinkedList<>();
        UserExample example = new UserExample();
        example.createCriteria().andStatusEqualTo(1);
        List<User> userList = userMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userList)){
            for (User user : userList){
                userIds.add(user.getId());
            }
        }
        return userIds;
    }
}
