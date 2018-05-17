package cn.clt.core.service.impl;

import cn.clt.core.entity.User;
import cn.clt.core.entity.UserExample;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.entity.UserInfoExample;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.mapper.UserInfoMapper;
import cn.clt.core.mapper.UserMapper;
import cn.clt.core.service.UserService;
import cn.clt.core.utils.GuidUtil;
import cn.clt.core.utils.ShiroMD5Util;
import cn.clt.core.vo.ActiveUser;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
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
    @Autowired
    private UserInfoMapper userInfoMapper;

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
        //更新
        Integer result = loginUpdate(user);
        if (result==0){
            throw new BussinessException("用户不存在.");
        }
        ActiveUser activeUser = new ActiveUser();
        activeUser.setUserId(user.getId());
        activeUser.setUserName(username);
        activeUser.setRole(user.getRole());
        //已经登录
        activeUser.setIsLogin(1);
        return activeUser;
    }

    /**
     * @Title loginUpdate
     * @Description 更新为登录状态
     * @Author CLT
     * @Date 2018/5/14 14:54
     * @param user
     * @return
     */
    private int loginUpdate(User user){
        user.setIsLogin(1);
        user.setModifyDate(new Date());
        return userMapper.updateByPrimaryKeySelective(user);
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
    public String insertPrUser(String username, String password) {
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
        user.setRole("user");
        user.setIsLogin(0);
        user.setStatus(1);
        user.setCreateDate(date);
        user.setModifyDate(date);
        userMapper.insert(user);
        return user.getId();
    }

    /**
     * @Title getUserByName
     * @Description
     * @Author CLT
     * @Date 2018/4/14 23:14
     * @param username
     * @return
     */
    public List<User> getUserByName(String username){
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(username).andStatusEqualTo(1);
        return userMapper.selectByExample(example);
    }

    /**
     * @Title erificationUserInfo
     * @Description 手机号校验
     * @Author CLT
     * @Date 2018/4/24 15:23
     * @param userName
     * @param phone
     */
    @Override
    public String erificationUserInfo(String userName, String phone) {
        User user = null;
        UserInfo userInfo = null;
        List<User> userList = getUserByName(userName);
        if (!CollectionUtils.isEmpty(userList)){
            user = userList.get(0);
        }
        String userId = user.getId();
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userInfos)){
            userInfo = userInfos.get(0);
        }
        String userPhone = userInfo.getUserPhone();
        if (!phone.equals(userPhone)){
            throw new BussinessException("手机号错误.");
        }
        return user.getId();
    }

    /**
     * @Title passwordSetting
     * @Description 新密码设置
     * @Author CLT
     * @Date 2018/4/24 15:48
     * @param userId
     * @param password
     * @param newPassword
     */
    @Override
    public String passwordSetting(String userId,String password, String newPassword) {
        User user = userMapper.selectByPrimaryKey(userId);
        if (user != null){
            String salt = user.getSalt();
            String username= user.getUserName();
            password = ShiroMD5Util.encode(password, username+salt);
            if (!password.equals(user.getPassword())){
                throw new BussinessException("密码错误");
            }
            password = ShiroMD5Util.encode(newPassword,username+salt);
            user.setPassword(password);
            userMapper.updateByPrimaryKeySelective(user);
            return userId;
        }else {
            throw new BussinessException("用户不存在");
        }
    }


    /**
     * @Title getUserById
     * @Description 根据id获取用户信息
     * @Author CLT
     * @Date 2018/5/3 16:29
     * @param id
     * @return
     */
    @Override
    public User getUserById(String id) {
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(id).andStatusEqualTo(1);
        List<User> userList = userMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userList)){
            return userList.get(0);
        }
        return null;
    }
}
