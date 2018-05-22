package cn.clt.core.vo;

import java.util.Date;

/**
 * @Description 评论管理
 * @Aouthor CLT
 * @Date 2018/05/17 11:05
 */
public class ReviewVO {
    private String id;

    private String articleId;

    private String articleTitle;

    private String reviewUserId;

    private String reviewUserPicture;

    private String reviewUserName;

    private Integer status;

    private Date createTime;

    private String content;

    private String userRealName;

    private String createTimeStr;

    /**点赞数**/
    private Integer countFabulous;

    private Integer countReview;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getReviewUserId() {
        return reviewUserId;
    }

    public void setReviewUserId(String reviewUserId) {
        this.reviewUserId = reviewUserId;
    }

    public String getReviewUserPicture() {
        return reviewUserPicture;
    }

    public void setReviewUserPicture(String reviewUserPicture) {
        this.reviewUserPicture = reviewUserPicture;
    }

    public String getReviewUserName() {
        return reviewUserName;
    }

    public void setReviewUserName(String reviewUserName) {
        this.reviewUserName = reviewUserName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public Integer getCountFabulous() {
        return countFabulous;
    }

    public void setCountFabulous(Integer countFabulous) {
        this.countFabulous = countFabulous;
    }

    public Integer getCountReview() {
        return countReview;
    }

    public void setCountReview(Integer countReview) {
        this.countReview = countReview;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }
}
