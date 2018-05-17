package cn.clt.core.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserAccount {
    private String id;

    private String userId;

    private BigDecimal userAmoutMoney;

    private Integer userTotalConcern;

    private Integer userTotalFans;

    private Integer userTotalBrowse;

    private Integer userTotalComment;

    private BigDecimal userTotalIntegral;

    private BigDecimal userTotalConsume;

    private BigDecimal userTotalRecharge;

    private Integer userTotalFabulous;

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

    public BigDecimal getUserAmoutMoney() {
        return userAmoutMoney;
    }

    public void setUserAmoutMoney(BigDecimal userAmoutMoney) {
        this.userAmoutMoney = userAmoutMoney;
    }

    public Integer getUserTotalConcern() {
        return userTotalConcern;
    }

    public void setUserTotalConcern(Integer userTotalConcern) {
        this.userTotalConcern = userTotalConcern;
    }

    public Integer getUserTotalFans() {
        return userTotalFans;
    }

    public void setUserTotalFans(Integer userTotalFans) {
        this.userTotalFans = userTotalFans;
    }

    public Integer getUserTotalBrowse() {
        return userTotalBrowse;
    }

    public void setUserTotalBrowse(Integer userTotalBrowse) {
        this.userTotalBrowse = userTotalBrowse;
    }

    public Integer getUserTotalComment() {
        return userTotalComment;
    }

    public void setUserTotalComment(Integer userTotalComment) {
        this.userTotalComment = userTotalComment;
    }

    public BigDecimal getUserTotalIntegral() {
        return userTotalIntegral;
    }

    public void setUserTotalIntegral(BigDecimal userTotalIntegral) {
        this.userTotalIntegral = userTotalIntegral;
    }

    public BigDecimal getUserTotalConsume() {
        return userTotalConsume;
    }

    public void setUserTotalConsume(BigDecimal userTotalConsume) {
        this.userTotalConsume = userTotalConsume;
    }

    public BigDecimal getUserTotalRecharge() {
        return userTotalRecharge;
    }

    public void setUserTotalRecharge(BigDecimal userTotalRecharge) {
        this.userTotalRecharge = userTotalRecharge;
    }

    public Integer getUserTotalFabulous() {
        return userTotalFabulous;
    }

    public void setUserTotalFabulous(Integer userTotalFabulous) {
        this.userTotalFabulous = userTotalFabulous;
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