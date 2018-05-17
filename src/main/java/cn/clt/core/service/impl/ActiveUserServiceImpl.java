package cn.clt.core.service.impl;

import cn.clt.core.service.ActiveUserService;
import cn.clt.core.vo.ActiveUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * @Description 获取用户登录信息 从session
 * @Aouthor CLT
 * @Date 2018/05/07 15:22
 */
@Service
public class ActiveUserServiceImpl implements ActiveUserService {

    private static final Logger logger = LoggerFactory.getLogger(ActiveUserServiceImpl.class);

    /**
     * @Title getActiveUser
     * @Description 获取用户登录信息
     * @Author CLT
     * @Date 2018/5/7 15:23
     * @param session
     * @return
     */
    @Override
    public ActiveUser getActiveUser(HttpSession session) {
        return  (ActiveUser) session.getAttribute("activeUser");
    }
}
