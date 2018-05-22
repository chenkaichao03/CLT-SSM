package cn.clt.core.vo;

/**
 * @Description
 * @Aouthor CLT
 * @Date 2018/05/21 18:08
 */
public class ExchangeOperationVO {

    private String userId;

    private String exchangeSettingId;

    private Integer exchangeNumber;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExchangeSettingId() {
        return exchangeSettingId;
    }

    public void setExchangeSettingId(String exchangeSettingId) {
        this.exchangeSettingId = exchangeSettingId;
    }

    public Integer getExchangeNumber() {
        return exchangeNumber;
    }

    public void setExchangeNumber(Integer exchangeNumber) {
        this.exchangeNumber = exchangeNumber;
    }
}
