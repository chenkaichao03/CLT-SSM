package cn.clt.core.security;
import cn.clt.core.entity.PrUser;
import cn.clt.core.entity.PrUserExample;
import cn.clt.core.mapper.PrUserMapper;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import java.util.List;

/**
 * @Description Realm(数据安全认证,授权)
 * @Aouthor CLT
 * @Date 2018/04/05 23:44
 */
public class ShiroRelam extends AuthenticatingRealm {

    @Autowired
    private PrUserMapper prUserMapper;

    /**
     /**
     * @Title doGetAuthenticationInfo
     * @Description
     * @Author CLT
     * @Date 2018/4/8 10:35
     * @param token
     * @return
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //这个token其实就是UsernamePasswordToken，对其进行强转
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        //通过token获取user信息
        String username = upToken.getUsername();
        PrUser prUser = getPrUserByUsername(username);
        //获取密码和盐值
        String dbpassword = null;
        String salt = null;
        if (prUser != null){
            String dbUsername = prUser.getUserName();
            dbpassword = prUser.getUserPassword();
            salt = prUser.getSalt();
            //判断账户信息
            if (!username.equals(dbUsername)){
                throw new UnknownAccountException("user is not exist!");
            }
        }else {
            throw new UnknownAccountException("user is not exist!");
        }
        //用户名和随机6位字符串salt做为盐值加密
        ByteSource byteSource = ByteSource.Util.bytes(username + salt);
        //由shiro对密码进行认证
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, dbpassword, byteSource,getName());
        return info;
    }

    /**
     * @Title getPrUserByUsername
     * @Description 根据用户名获取用户信息
     * @Author CLT
     * @Date 2018/4/8 10:41
     * @param username
     * @return
     */
    private PrUser getPrUserByUsername(String username){
        PrUserExample example = new PrUserExample();
        example.createCriteria().andUserNameEqualTo(username);
        List<PrUser> prUsers = prUserMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(prUsers)){
            return prUsers.get(0);
        }
        return null;
    }
}
