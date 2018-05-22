package cn.clt.core.params;

import cn.clt.core.entity.Article;
import cn.clt.core.entity.Review;
import cn.clt.core.entity.UserExchange;
import cn.clt.core.vo.ReviewDetalVO;
import cn.clt.core.vo.ReviewVO;
import cn.clt.core.vo.UserInfoVO;

import java.util.List;

/**
 * @Description 查询分页数据集合
 * @Aouthor CLT
 * @Date 2018/04/02 18:37
 */
public class ManagementPageData extends BasePageData{
    /**分页数据集**/
    private List<Article> articleList;
    private List<UserInfoVO> concernList;
    private List<UserInfoVO> fansList;
    private List<UserInfoVO> userList;
    private List<UserExchange> userExchangeList;
    private List<Review> reviewList;
    private List<ReviewVO> reviewVOList;
    private List<ReviewDetalVO> reviewDetalVOS;

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    public List<UserInfoVO> getConcernList() {
        return concernList;
    }

    public void setConcernList(List<UserInfoVO> concernList) {
        this.concernList = concernList;
    }

    public List<UserInfoVO> getFansList() {
        return fansList;
    }

    public void setFansList(List<UserInfoVO> fansList) {
        this.fansList = fansList;
    }

    public List<UserInfoVO> getUserList() {
        return userList;
    }

    public void setUserList(List<UserInfoVO> userList) {
        this.userList = userList;
    }

    public List<UserExchange> getUserExchangeList() {
        return userExchangeList;
    }

    public void setUserExchangeList(List<UserExchange> userExchangeList) {
        this.userExchangeList = userExchangeList;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public List<ReviewVO> getReviewVOList() {
        return reviewVOList;
    }

    public void setReviewVOList(List<ReviewVO> reviewVOList) {
        this.reviewVOList = reviewVOList;
    }

    public List<ReviewDetalVO> getReviewDetalVOS() {
        return reviewDetalVOS;
    }

    public void setReviewDetalVOS(List<ReviewDetalVO> reviewDetalVOS) {
        this.reviewDetalVOS = reviewDetalVOS;
    }
}
