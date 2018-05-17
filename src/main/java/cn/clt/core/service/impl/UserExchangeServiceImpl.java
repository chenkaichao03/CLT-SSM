package cn.clt.core.service.impl;

import cn.clt.core.entity.UserExchange;
import cn.clt.core.mapper.UserExchangeMapper;
import cn.clt.core.service.UserExchangeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description UserExchangeServiceImpl
 * @Aouthor CLT
 * @Date 2018/05/10 14:11
 */
@Service
public class UserExchangeServiceImpl implements UserExchangeService {

    private static final Logger logger = LoggerFactory.getLogger(UserExchangeServiceImpl.class);

    @Autowired
    private UserExchangeMapper userExchangeMapper;

    /**
     * @Title listUserExchange
     * @Description 用户兑换列表 分页
     * @Author CLT
     * @Date 2018/5/10 14:14
     * @param params
     * @return
     */
    @Override
    public List<UserExchange> listUserExchange(Map<String,Object> params) {
        return userExchangeMapper.listUserExchange(params);
    }

    /**
     * @Title countUserExchange
     * @Description 用户兑换次数
     * @Author CLT
     * @Date 2018/5/10 14:14
     * @param params
     * @return
     */
    @Override
    public Long countUserExchange(Map<String,Object> params) {
        return userExchangeMapper.countUserExchange(params);
    }
}
