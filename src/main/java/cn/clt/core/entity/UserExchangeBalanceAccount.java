package cn.clt.core.entity;

import java.util.Date;

public class UserExchangeBalanceAccount {
    private String id;

    private String userId;

    private Integer fansExchangeNumber;

    private Integer fansBeforeBalance;

    private Integer fansAfterBalance;

    private Integer browseExchangeNumber;

    private Integer browseBeforeBalance;

    private Integer browseAfterBalance;

    private Integer fabulousExchangeNumber;

    private Integer fabulousBeforeBalance;

    private Integer fabulousAfterBalance;

    private Integer commentExchangeNumber;

    private Integer commentBeforeBalance;

    private Integer commentAfterBalance;

    private Integer status;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getFansExchangeNumber() {
        return fansExchangeNumber;
    }

    public void setFansExchangeNumber(Integer fansExchangeNumber) {
        this.fansExchangeNumber = fansExchangeNumber;
    }

    public Integer getFansBeforeBalance() {
        return fansBeforeBalance;
    }

    public void setFansBeforeBalance(Integer fansBeforeBalance) {
        this.fansBeforeBalance = fansBeforeBalance;
    }

    public Integer getFansAfterBalance() {
        return fansAfterBalance;
    }

    public void setFansAfterBalance(Integer fansAfterBalance) {
        this.fansAfterBalance = fansAfterBalance;
    }

    public Integer getBrowseExchangeNumber() {
        return browseExchangeNumber;
    }

    public void setBrowseExchangeNumber(Integer browseExchangeNumber) {
        this.browseExchangeNumber = browseExchangeNumber;
    }

    public Integer getBrowseBeforeBalance() {
        return browseBeforeBalance;
    }

    public void setBrowseBeforeBalance(Integer browseBeforeBalance) {
        this.browseBeforeBalance = browseBeforeBalance;
    }

    public Integer getBrowseAfterBalance() {
        return browseAfterBalance;
    }

    public void setBrowseAfterBalance(Integer browseAfterBalance) {
        this.browseAfterBalance = browseAfterBalance;
    }

    public Integer getFabulousExchangeNumber() {
        return fabulousExchangeNumber;
    }

    public void setFabulousExchangeNumber(Integer fabulousExchangeNumber) {
        this.fabulousExchangeNumber = fabulousExchangeNumber;
    }

    public Integer getFabulousBeforeBalance() {
        return fabulousBeforeBalance;
    }

    public void setFabulousBeforeBalance(Integer fabulousBeforeBalance) {
        this.fabulousBeforeBalance = fabulousBeforeBalance;
    }

    public Integer getFabulousAfterBalance() {
        return fabulousAfterBalance;
    }

    public void setFabulousAfterBalance(Integer fabulousAfterBalance) {
        this.fabulousAfterBalance = fabulousAfterBalance;
    }

    public Integer getCommentExchangeNumber() {
        return commentExchangeNumber;
    }

    public void setCommentExchangeNumber(Integer commentExchangeNumber) {
        this.commentExchangeNumber = commentExchangeNumber;
    }

    public Integer getCommentBeforeBalance() {
        return commentBeforeBalance;
    }

    public void setCommentBeforeBalance(Integer commentBeforeBalance) {
        this.commentBeforeBalance = commentBeforeBalance;
    }

    public Integer getCommentAfterBalance() {
        return commentAfterBalance;
    }

    public void setCommentAfterBalance(Integer commentAfterBalance) {
        this.commentAfterBalance = commentAfterBalance;
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