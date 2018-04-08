package cn.clt.core.service.impl;

import cn.clt.core.entity.PrUser;
import cn.clt.core.entity.PrUserExample;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.mapper.PrUserMapper;
import cn.clt.core.service.PrUserService;
import cn.clt.core.utils.GuidUtil;
import cn.clt.core.utils.ShiroMD5Util;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description PrUserServiceImpl
 * @Aouthor CLT
 * @Date 2018/04/08 15:55
 */
@Service
public class PrUserServiceImpl implements PrUserService {
    @Autowired
    private PrUserMapper prUserMapper;

    /**
     * @Title getPrUserByUsername
     * @Description 根据用户名获取用户
     * @Author CLT
     * @Date 2018/4/8 15:57
     * @param username
     * @return
     */
    @Override
    public List<PrUser> getPrUserByUsername(String username) {
        PrUserExample example = new PrUserExample();
        example.createCriteria().andUserNameEqualTo(username);
        return prUserMapper.selectByExample(example);
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
        List<PrUser> prUsers = getPrUserByUsername(username);
        if (prUsers.size() > 0){
            throw new BussinessException("用户已存在.");
        }
        //新增
        PrUser prUser = new PrUser();
        prUser.setUserId(GuidUtil.newGuid());
        prUser.setUserName(username);
        //获取6位随机字符 保存在数据库中
        String salt = ShiroMD5Util.getSalt();
        prUser.setSalt(salt);
        //盐值 ： 6位随机字符 + 用户名  此时password已加密
        password =  ShiroMD5Util.encode(password, salt+username);
        prUser.setUserPassword(password);
        prUserMapper.insert(prUser);
    }


}
