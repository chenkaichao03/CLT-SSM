package cn.clt.core.service;

import cn.clt.core.entity.UserAccount;
import cn.clt.core.entity.UserExchangeBalanceAccount;

/**
 * @Description UserAccountService
 * @Aouthor CLT
 * @Date 2018/05/19 15:16
 */
public interface UserAccountService {

    /**
     * @Title statisticsUserAccount
     * @Description 统计所有用户账户的浏览量
     * @Author CLT
     * @Date 2018/5/19 15:20
     * @return
     */
    Integer statisticsUserAccount();

    /**
     * @Title statisticsUserAccountByUserId
     * @Description 统计某个用户账户下的文章浏览量
     * @Author CLT
     * @Date 2018/5/20 22:13
     * @param userId
     * @return
     */
    Integer statisticsUserAccountByUserId(String userId);

    /**
     * @Title updateUserExchangeBalanceAccount
     * @Description 更新账户余额表
     * @Author CLT
     * @Date 2018/5/22 11:06
     * @param userId
     * @return
     */
    String updateUserExchangeBalanceAccount(String userId);


    String updateUserExchangeBalanceAccount(UserExchangeBalanceAccount userExchangeBalanceAccount, UserAccount userAccount);



    Integer statisticsUserAccountBrowseSum(String userId);

    /**
     * @Title getUserAccountByUserId
     * @Description 根据用户id获取账户信息
     * @Author CLT
     * @Date 2018/5/19 15:50
     * @param userId
     * @return
     */
    UserAccount getUserAccountByUserId(String userId);


    /**
     * @Title updateUserAccount
     * @Description 更新账户信息
     * @Author CLT
     * @Date 2018/5/19 21:39
     * @param userAccount
     * @return
     */
    Integer updateUserAccount(UserAccount userAccount);
}
