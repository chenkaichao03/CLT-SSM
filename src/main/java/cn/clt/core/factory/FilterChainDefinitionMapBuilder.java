package cn.clt.core.factory;

import java.util.LinkedHashMap;

/**
 * @Description shiro过滤页面需要的权限
 * @Aouthor CLT
 * @Date 2018/04/08 15:22
 */
public class FilterChainDefinitionMapBuilder {

    /**
     * @Title buildFilterChainDefinitionMap
     * @Description anon 可以被匿名访问  authc 必须认证(即登录)后才可能访问的页面. logout 登出. roles 角色过滤器
     * @Author CLT
     * @Date 2018/4/8 15:27
     * @return
     */
    public LinkedHashMap<String,String> buildFilterChainDefinitionMap(){
        LinkedHashMap<String,String> chainDefinitionMap = new LinkedHashMap<>();
        chainDefinitionMap.put("/views/login.jsp","anon");
        chainDefinitionMap.put("/shiro/login","anon");
        chainDefinitionMap.put("/shiro/logout","logout");
        chainDefinitionMap.put("/** ","authc");
        return chainDefinitionMap;
    }
}
