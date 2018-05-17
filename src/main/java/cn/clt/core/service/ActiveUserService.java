package cn.clt.core.service;

import cn.clt.core.vo.ActiveUser;

import javax.servlet.http.HttpSession;

/**
 * @Description 获取用户登录信息 从session
 * @Aouthor CLT
 * @Date 2018/05/07 15:21
 */
public interface ActiveUserService {

    /**
     * @Title getActiveUser
     * @Description 获取用户登录信息
     * @Author CLT
     * @Date 2018/5/7 15:23
     * @param session
     * @return
     */
    ActiveUser getActiveUser(HttpSession session);
}
