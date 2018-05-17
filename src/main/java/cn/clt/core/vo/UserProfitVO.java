package cn.clt.core.vo;

import java.math.BigDecimal;

/**
 * @Description 用户收益VO
 * @Aouthor CLT
 * @Date 2018/05/10 14:54
 */
public class UserProfitVO {
    /**兑换数量**/
    private BigDecimal totalAmountNumber;
    /**兑换收益金额**/
    private BigDecimal totalAmountMomey;

    public UserProfitVO(BigDecimal totalAmountMomey,BigDecimal totalAmountNumber){
        this.totalAmountMomey = totalAmountMomey;
        this.totalAmountNumber = totalAmountNumber;
    }

    public BigDecimal getTotalAmountNumber() {
        return totalAmountNumber;
    }

    public void setTotalAmountNumber(BigDecimal totalAmountNumber) {
        this.totalAmountNumber = totalAmountNumber;
    }

    public BigDecimal getTotalAmountMomey() {
        return totalAmountMomey;
    }

    public void setTotalAmountMomey(BigDecimal totalAmountMomey) {
        this.totalAmountMomey = totalAmountMomey;
    }
}
