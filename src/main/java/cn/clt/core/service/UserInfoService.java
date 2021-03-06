package cn.clt.core.service;

import cn.clt.core.entity.UserInfo;
import cn.clt.core.params.ManagementPageData;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

/**
 * @Description UserInfoService
 * @Aouthor CLT
 * @Date 2018/04/22 14:31
 */
public interface UserInfoService {

    String insertUserInfo(UserInfo info, String userId);

    List<UserInfo> listUserInfo(String id);

    List<UserInfo> listUserInfoByUsreId(String userId);

    List<UserInfo> listUserInfoByUserPhone(String userPhone);

    void userPictureSetting(String userId, MultipartFile file, String path);

    ManagementPageData selectUserPage(Integer pageNo, Integer pageSize);
}
