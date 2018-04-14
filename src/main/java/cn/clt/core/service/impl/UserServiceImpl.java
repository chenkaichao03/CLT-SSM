package cn.clt.core.service.impl;

import cn.clt.core.entity.User;
import cn.clt.core.entity.UserExample;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.mapper.UserMapper;
import cn.clt.core.service.UserService;
import cn.clt.core.utils.GuidUtil;
import cn.clt.core.utils.ShiroMD5Util;
import cn.clt.core.vo.ActiveUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * @Description PrUserServiceImpl
 * @Aouthor CLT
 * @Date 2018/04/08 15:55
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * @Title getPrUserByUsername
     * @Description 校验用户，并返回用户信息
     * @Author CLT
     * @Date 2018/4/8 15:57
     * @param username
     * @return
     */
    @Override
    public ActiveUser authenticat(String username, String password) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(username);
        List<User> userList = userMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(userList)){
            throw new BussinessException("用户不存在");
        }
        User user = userList.get(0);
        String salt = user.getSalt();
        password = ShiroMD5Util.encode(password, username+salt);
        if (!password.equals(user.getPassword())){
            throw new BussinessException("密码错误");
        }
        ActiveUser activeUser = new ActiveUser();
        activeUser.setUserId(user.getId());
        activeUser.setUserName(username);
        return activeUser;
    }

    /**
     * @Title insertPrUser
     * @Description 注册用户
     * @Author CLT
     * @Date 2018/4/8 16:04
     * @param username
     * @param password
     */
    @Override
    public void insertPrUser(String username, String password) {
        List<User> userList = getUserByName(username);
        if (userList.size() > 0){
            throw new BussinessException("用户已存在.");
        }
        Date date = new Date();
        //获取6位随机字符 保存在数据库中
        String salt = ShiroMD5Util.getSalt();
        //盐值 ： 6位随机字符 + 用户名  此时password已加密
        password = ShiroMD5Util.encode(password, username + salt);
        //新增
        User user = new User();
        user.setId(GuidUtil.newGuid());
        user.setUserName(username);
        user.setPassword(password);
        user.setSalt(salt);
        user.setStatus(1);
        user.setCreateDate(date);
        user.setModifyDate(date);
        userMapper.insert(user);
    }

    /**
     * @Title getUserByName
     * @Description
     * @Author CLT
     * @Date 2018/4/14 23:14
     * @param username
     * @return
     */
    private List<User> getUserByName(String username){
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(username).andStatusEqualTo(1);
        return userMapper.selectByExample(example);
    }

}
