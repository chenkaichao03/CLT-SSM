package cn.clt.core.service;

import cn.clt.core.entity.UserExchangeBalanceAccount;

/**
 * @Description UserExchangeBalanceAccountService
 * @Aouthor CLT
 * @Date 2018/05/22 10:14
 */
public interface UserExchangeBalanceAccountService {

    /**
     * @Title getUserExchangeBalanceAccount
     * @Description 获取账户余额表
     * @Author CLT
     * @Date 2018/5/22 10:16
     * @param userId
     * @return
     */
    UserExchangeBalanceAccount getUserExchangeBalanceAccount(String userId);


    /**
     * @Title updateUserExchangeBalanceAccount
     * @Description 更新账户余额
     * @Author CLT
     * @Date 2018/5/22 10:52
     * @param userExchangeBalanceAccount
     * @return
     */
    int updateUserExchangeBalanceAccount(UserExchangeBalanceAccount userExchangeBalanceAccount);

    /**
     * @Title insertUserExchangeBalanceAccount
     * @Description 新增账户余额
     * @Author CLT
     * @Date 2018/5/22 11:16
     * @param userExchangeBalanceAccount
     */
    void insertUserExchangeBalanceAccount(UserExchangeBalanceAccount userExchangeBalanceAccount);
}
