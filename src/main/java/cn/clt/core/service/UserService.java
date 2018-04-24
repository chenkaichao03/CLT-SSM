package cn.clt.core.service;

import cn.clt.core.vo.ActiveUser;

/**
 * @Description UserService
 * @Aouthor CLT
 * @Date 2018/04/08 15:55
 */
public interface UserService {
    /**
     * @Title getPrUserByUsername
     * @Description 校验用户，并返回用户信息
     * @Author CLT
     * @Date 2018/4/8 15:57
     * @param username
     * @return
     */
    ActiveUser authenticat(String username, String password);

    /**
     * @Title insertPrUser
     * @Description 注册用户
     * @Author CLT
     * @Date 2018/4/8 16:04
     * @param username
     * @param password
     */
    void insertPrUser(String username, String password);

    /**
     * @Title erificationUserInfo
     * @Description 手机号校验
     * @Author Lizi
     * @Date 2018/4/24 15:23
     * @param userName
     * @param phone
     */
    String erificationUserInfo(String userName,String phone);

    /**
     * @Title passwordSetting
     * @Description 新密码设置
     * @Author Lizi
     * @Date 2018/4/24 15:48
     * @param password
     * @param newPassword
     */
    String passwordSetting(String userId,String password,String newPassword);
}
