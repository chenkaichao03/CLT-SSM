package cn.clt.core.enums;

import org.springframework.util.StringUtils;

/**
 * @Description 兑换类型
 * @Aouthor CLT
 * @Date 2018/05/09 17:27
 */
public enum ExchangeTypeCode {

    FANS("粉丝兑换"),
    BROWSE("浏览量兑换"),
    COMMENT("评论量兑换"),
    INTEGRAL("积分兑换"),
    EXCHANGE_COUNT("兑换总次数"),
    FABULOUS("点赞数兑换");


    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private ExchangeTypeCode(String desc){
        this.desc = desc;
    }

    /**
     * @Title checkExchangeType
     * @Description 判断是否是合法的兑换类型
     * @Author CLT
     * @Date 2018/5/9 17:36
     * @param type
     * @return
     */
    public static boolean checkExchangeType(String type){
        if (StringUtils.isEmpty(type)) return false;
        for (ExchangeTypeCode exchangeTypeCode : ExchangeTypeCode.values()){
            if (type.equals(exchangeTypeCode.name())) return true;
        }
        return false;
    }

    /**
     * @Title getExchangeTypeName
     * @Description 获取兑换类型的名称
     * @Author CLT
     * @Date 2018/5/9 17:56
     * @param type
     * @return
     */
    public static String getExchangeTypeName(String type){
        if (StringUtils.isEmpty(type)) return null;
        for (ExchangeTypeCode exchangeTypeCode : ExchangeTypeCode.values()){
            if (type.equals(exchangeTypeCode.name())) return exchangeTypeCode.desc;
        }
        return null;
    }
}
