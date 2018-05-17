package cn.clt.core.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserExchange {
    private String id;

    private String userId;

    private String userNo;

    private String userName;

    private String userRealName;

    private String userPhone;

    private String exchangeType;

    private String exchangeTypeName;

    private BigDecimal exchangeRateNumber;

    private BigDecimal exchangeRateMoney;

    private BigDecimal exchangeAmountNumber;

    private BigDecimal exchangeAmountMoney;

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

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType == null ? null : exchangeType.trim();
    }

    public String getExchangeTypeName() {
        return exchangeTypeName;
    }

    public void setExchangeTypeName(String exchangeTypeName) {
        this.exchangeTypeName = exchangeTypeName == null ? null : exchangeTypeName.trim();
    }

    public BigDecimal getExchangeRateNumber() {
        return exchangeRateNumber;
    }

    public void setExchangeRateNumber(BigDecimal exchangeRateNumber) {
        this.exchangeRateNumber = exchangeRateNumber;
    }

    public BigDecimal getExchangeRateMoney() {
        return exchangeRateMoney;
    }

    public void setExchangeRateMoney(BigDecimal exchangeRateMoney) {
        this.exchangeRateMoney = exchangeRateMoney;
    }

    public BigDecimal getExchangeAmountNumber() {
        return exchangeAmountNumber;
    }

    public void setExchangeAmountNumber(BigDecimal exchangeAmountNumber) {
        this.exchangeAmountNumber = exchangeAmountNumber;
    }

    public BigDecimal getExchangeAmountMoney() {
        return exchangeAmountMoney;
    }

    public void setExchangeAmountMoney(BigDecimal exchangeAmountMoney) {
        this.exchangeAmountMoney = exchangeAmountMoney;
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