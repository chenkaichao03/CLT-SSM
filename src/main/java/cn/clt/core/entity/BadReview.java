package cn.clt.core.entity;

import java.util.Date;

public class BadReview {
    private String id;

    private String reviewId;

    private String articleId;

    private String badReviewUserId;

    private String badReviewUserPicture;

    private String badReviewUserName;

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

    public String getBadReviewUserId() {
        return badReviewUserId;
    }

    public void setBadReviewUserId(String badReviewUserId) {
        this.badReviewUserId = badReviewUserId == null ? null : badReviewUserId.trim();
    }

    public String getBadReviewUserPicture() {
        return badReviewUserPicture;
    }

    public void setBadReviewUserPicture(String badReviewUserPicture) {
        this.badReviewUserPicture = badReviewUserPicture == null ? null : badReviewUserPicture.trim();
    }

    public String getBadReviewUserName() {
        return badReviewUserName;
    }

    public void setBadReviewUserName(String badReviewUserName) {
        this.badReviewUserName = badReviewUserName == null ? null : badReviewUserName.trim();
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