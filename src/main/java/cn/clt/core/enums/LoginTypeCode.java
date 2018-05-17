package cn.clt.core.enums;

import org.springframework.util.StringUtils;

/**
 * @Description 登录类型
 * @Aouthor CLT
 * @Date 2018/05/14 14:15
 */
public enum LoginTypeCode {
    HOME_PAGE_LOGIN,
    BACKSTAGE,
    SHOW_PAGE;

    private LoginTypeCode(){}

    /**
     * @Title checkExchangeType
     * @Description 判断是否是合法的兑换类型
     * @Author CLT
     * @Date 2018/5/9 17:36
     * @param type
     * @return
     */
    public static boolean checkLoginTypeCode(String type){
        if (StringUtils.isEmpty(type)) return false;
        for (LoginTypeCode loginTypeCode : LoginTypeCode.values()){
            if (type.equals(loginTypeCode.name())) return true;
        }
        return false;
    }
}
