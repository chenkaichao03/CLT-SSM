package cn.clt.core.service;


import cn.clt.core.entity.UserExchange;

import java.util.List;
import java.util.Map;

/**
 * @Description UserExchangeService
 * @Aouthor CLT
 * @Date 2018/05/10 14:10
 */
public interface UserExchangeService {

    /**
     * @Title listUserExchange
     * @Description 用户兑换列表 分页
     * @Author CLT
     * @Date 2018/5/10 14:14
     * @param params
     * @return
     */
    List<UserExchange> listUserExchange(Map<String,Object> params);

    /**
     * @Title countUserExchange
     * @Description 用户兑换次数
     * @Author CLT
     * @Date 2018/5/10 14:14
     * @param params
     * @return
     */
    Long countUserExchange(Map<String,Object> params);
}
