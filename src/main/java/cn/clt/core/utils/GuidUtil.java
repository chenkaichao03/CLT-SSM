package cn.clt.core.utils;

import java.util.UUID;

/**
 * @Description UUID工具类
 * @Aouthor CLT
 * @Date 2018/04/08 15:48
 */
public class GuidUtil {

    /**
     * @Title newGuid
     * @Description 生成UUID 32位
     * @Author CLT
     * @Date 2018/4/8 15:50
     * @return
     */
    public static String newGuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
