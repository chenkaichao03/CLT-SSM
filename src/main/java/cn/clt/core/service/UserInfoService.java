package cn.clt.core.service;


import cn.clt.core.entity.UserInfo;

import java.io.File;
import java.util.List;

/**
 * @Description UserInfoService
 * @Aouthor CLT
 * @Date 2018/04/22 14:31
 */
public interface UserInfoService {

    void insertUserInfo(UserInfo userInfo, String originalFileName, File pathFile);

    List<UserInfo> listUserInfo(String id);

    List<UserInfo> listUserInfoByUsreId(String userId);

    List<UserInfo> listUserInfoByUserPhone(String userPhone);
}
