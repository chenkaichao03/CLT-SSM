package cn.clt.core.entity;

import java.util.Date;
import java.util.List;

public class Review {
    private String id;

    private String articleId;

    private String reviewUserId;

    private String reviewUserPicture;

    private String reviewUserName;

    private Integer status;

    private Date createTime;

    private String content;

    List<ReviewDetail> reviewDetailList;

    private Integer dayDifferent;

    private Long countGoodReview;

    private Long countBadReview;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public List<ReviewDetail> getReviewDetailList() {
        return reviewDetailList;
    }

    public void setReviewDetailList(List<ReviewDetail> reviewDetailList) {
        this.reviewDetailList = reviewDetailList;
    }

    public Integer getDayDifferent() {
        return dayDifferent;
    }

    public void setDayDifferent(Integer dayDifferent) {
        this.dayDifferent = dayDifferent;
    }

    public Long getCountGoodReview() {
        return countGoodReview;
    }

    public void setCountGoodReview(Long countGoodReview) {
        this.countGoodReview = countGoodReview;
    }

    public Long getCountBadReview() {
        return countBadReview;
    }

    public void setCountBadReview(Long countBadReview) {
        this.countBadReview = countBadReview;
    }
}