package cn.clt.core.entity;

import java.util.Date;

public class GoodReview {
    private String id;

    private String reviewId;

    private String articleId;

    private String goodReviewUserId;

    private String goodReviewUserPicture;

    private String goodReviewUserName;

    private Integer status;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId == null ? null : reviewId.trim();
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    public String getGoodReviewUserId() {
        return goodReviewUserId;
    }

    public void setGoodReviewUserId(String goodReviewUserId) {
        this.goodReviewUserId = goodReviewUserId == null ? null : goodReviewUserId.trim();
    }

    public String getGoodReviewUserPicture() {
        return goodReviewUserPicture;
    }

    public void setGoodReviewUserPicture(String goodReviewUserPicture) {
        this.goodReviewUserPicture = goodReviewUserPicture == null ? null : goodReviewUserPicture.trim();
    }

    public String getGoodReviewUserName() {
        return goodReviewUserName;
    }

    public void setGoodReviewUserName(String goodReviewUserName) {
        this.goodReviewUserName = goodReviewUserName == null ? null : goodReviewUserName.trim();
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
}