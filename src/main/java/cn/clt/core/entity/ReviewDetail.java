package cn.clt.core.entity;

import java.util.Date;
import java.util.List;

public class ReviewDetail {
    private String id;

    private String reviewId;

    private String articleId;

    private String reviewUserId;

    private String reviewUserPicture;

    private String reviewUserName;

    private String parentReviewId;

    private Integer status;

    private Date createTime;

    private String content;

    List<ReviewDetail> reviewDetails;

    private Integer dayDifferent;

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

    public String getReviewUserId() {
        return reviewUserId;
    }

    public void setReviewUserId(String reviewUserId) {
        this.reviewUserId = reviewUserId == null ? null : reviewUserId.trim();
    }

    public String getReviewUserPicture() {
        return reviewUserPicture;
    }

    public void setReviewUserPicture(String reviewUserPicture) {
        this.reviewUserPicture = reviewUserPicture == null ? null : reviewUserPicture.trim();
    }

    public String getReviewUserName() {
        return reviewUserName;
    }

    public void setReviewUserName(String reviewUserName) {
        this.reviewUserName = reviewUserName == null ? null : reviewUserName.trim();
    }

    public String getParentReviewId() {
        return parentReviewId;
    }

    public void setParentReviewId(String parentReviewId) {
        this.parentReviewId = parentReviewId == null ? null : parentReviewId.trim();
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
        this.content = content == null ? null : content.trim();
    }

    public List<ReviewDetail> getReviewDetails() {
        return reviewDetails;
    }

    public void setReviewDetails(List<ReviewDetail> reviewDetails) {
        this.reviewDetails = reviewDetails;
    }

    public Integer getDayDifferent() {
        return dayDifferent;
    }

    public void setDayDifferent(Integer dayDifferent) {
        this.dayDifferent = dayDifferent;
    }
}