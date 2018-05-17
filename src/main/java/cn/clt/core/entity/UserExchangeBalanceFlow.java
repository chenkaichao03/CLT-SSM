package cn.clt.core.entity;

import java.util.Date;

public class UserExchangeBalanceFlow {
    private String id;

    private String userId;

    private Integer commentBalanceBefore;

    private Integer commentBalanceAfter;

    private Integer fansBalanceBefore;

    private Integer fansBalanceAfter;

    private Integer browseBalanceBefore;

    private Integer browseBalanceAfter;

    private Integer exchangeCoutBefore;

    private Integer exchangeCountAfter;

    private Integer fabulousBalanceBefore;

    private Integer fabulousBalanceAfter;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

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

    public Integer getCommentBalanceBefore() {
        return commentBalanceBefore;
    }

    public void setCommentBalanceBefore(Integer commentBalanceBefore) {
        this.commentBalanceBefore = commentBalanceBefore;
    }

    public Integer getCommentBalanceAfter() {
        return commentBalanceAfter;
    }

    public void setCommentBalanceAfter(Integer commentBalanceAfter) {
        this.commentBalanceAfter = commentBalanceAfter;
    }

    public Integer getFansBalanceBefore() {
        return fansBalanceBefore;
    }

    public void setFansBalanceBefore(Integer fansBalanceBefore) {
        this.fansBalanceBefore = fansBalanceBefore;
    }

    public Integer getFansBalanceAfter() {
        return fansBalanceAfter;
    }

    public void setFansBalanceAfter(Integer fansBalanceAfter) {
        this.fansBalanceAfter = fansBalanceAfter;
    }

    public Integer getBrowseBalanceBefore() {
        return browseBalanceBefore;
    }

    public void setBrowseBalanceBefore(Integer browseBalanceBefore) {
        this.browseBalanceBefore = browseBalanceBefore;
    }

    public Integer getBrowseBalanceAfter() {
        return browseBalanceAfter;
    }

    public void setBrowseBalanceAfter(Integer browseBalanceAfter) {
        this.browseBalanceAfter = browseBalanceAfter;
    }

    public Integer getExchangeCoutBefore() {
        return exchangeCoutBefore;
    }

    public void setExchangeCoutBefore(Integer exchangeCoutBefore) {
        this.exchangeCoutBefore = exchangeCoutBefore;
    }

    public Integer getExchangeCountAfter() {
        return exchangeCountAfter;
    }

    public void setExchangeCountAfter(Integer exchangeCountAfter) {
        this.exchangeCountAfter = exchangeCountAfter;
    }

    public Integer getFabulousBalanceBefore() {
        return fabulousBalanceBefore;
    }

    public void setFabulousBalanceBefore(Integer fabulousBalanceBefore) {
        this.fabulousBalanceBefore = fabulousBalanceBefore;
    }

    public Integer getFabulousBalanceAfter() {
        return fabulousBalanceAfter;
    }

    public void setFabulousBalanceAfter(Integer fabulousBalanceAfter) {
        this.fabulousBalanceAfter = fabulousBalanceAfter;
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

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}