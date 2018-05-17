package cn.clt.core.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserExchangeBalanceFlowDetail {
    private String id;

    private String flowId;

    private String exchangeId;

    private String exchangeType;

    private String exchangeName;

    private BigDecimal exchangeMoneyBefore;

    private BigDecimal exchangeMoneyAfter;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    public String getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(String exchangeId) {
        this.exchangeId = exchangeId == null ? null : exchangeId.trim();
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType == null ? null : exchangeType.trim();
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName == null ? null : exchangeName.trim();
    }

    public BigDecimal getExchangeMoneyBefore() {
        return exchangeMoneyBefore;
    }

    public void setExchangeMoneyBefore(BigDecimal exchangeMoneyBefore) {
        this.exchangeMoneyBefore = exchangeMoneyBefore;
    }

    public BigDecimal getExchangeMoneyAfter() {
        return exchangeMoneyAfter;
    }

    public void setExchangeMoneyAfter(BigDecimal exchangeMoneyAfter) {
        this.exchangeMoneyAfter = exchangeMoneyAfter;
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