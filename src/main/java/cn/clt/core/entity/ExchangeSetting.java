package cn.clt.core.entity;

import java.util.Date;

public class ExchangeSetting {
    private String id;

    private String exchangeType;

    private String exchangeTypeName;

    private Integer exchangeRateNumber;

    private Integer exchangeRateMoney;

    private Integer status;

    private String createUserId;

    private Date createTime;

    private String modifyUserId;

    private Date modifyTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public Integer getExchangeRateNumber() {
        return exchangeRateNumber;
    }

    public void setExchangeRateNumber(Integer exchangeRateNumber) {
        this.exchangeRateNumber = exchangeRateNumber;
    }

    public Integer getExchangeRateMoney() {
        return exchangeRateMoney;
    }

    public void setExchangeRateMoney(Integer exchangeRateMoney) {
        this.exchangeRateMoney = exchangeRateMoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId == null ? null : modifyUserId.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}