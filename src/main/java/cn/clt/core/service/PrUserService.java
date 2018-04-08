package cn.clt.core.service;

import cn.clt.core.entity.PrUser;

import java.util.List;

/**
 * @Description PrUserService
 * @Aouthor CLT
 * @Date 2018/04/08 15:55
 */
public interface PrUserService {
    /**
     * @Title getPrUserByUsername
     * @Description 根据用户名获取用户
     * @Author CLT
     * @Date 2018/4/8 15:57
     * @param username
     * @return
     */
    List<PrUser> getPrUserByUsername(String username);

    /**
     * @Title insertPrUser
     * @Description 注册用户
     * @Author CLT
     * @Date 2018/4/8 16:04
     * @param username
     * @param password
     */
    void insertPrUser(String username, String password);
}
