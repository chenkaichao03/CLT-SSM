package cn.clt.core.utils;

import cn.clt.core.constant.ShiroConstant;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @Description shiroMD5加密
 * @Aouthor CLT
 * @Date 2018/04/06 23:08
 */
public class ShiroMD5Util {
    /**加密 source：密码 salt:盐值（用户名+6位随机字符串为值）**/
    public static String encode(Object source, Object salt){
        return new SimpleHash(ShiroConstant.ALGORITHMNAME, source, salt, ShiroConstant.HASHITERATIONS).toHex();
    }

    /**获取6位随机字符**/
    public static String getSalt(){
        SecureRandomNumberGenerator secureRandom = new SecureRandomNumberGenerator();
        return secureRandom.nextBytes(100).toHex();
    }

}
