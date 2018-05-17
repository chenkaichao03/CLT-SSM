package cn.clt.core.service.impl;

import cn.clt.core.entity.Concern;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.entity.UserInfoExample;
import cn.clt.core.enums.RoleCode;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.mapper.ConcernMapper;
import cn.clt.core.mapper.UserInfoMapper;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.params.Pagination;
import cn.clt.core.service.UserInfoService;
import cn.clt.core.utils.GuidUtil;
import cn.clt.core.vo.UserInfoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.*;

/**
 * @Description UserInfoServiceImpl
 * @Aouthor CLT
 * @Date 2018/04/22 14:31
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    private static Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private ConcernMapper concernMapper;

    /**
     * @Title insertUserInfo
     * @Description 用户信息设置
     * @Author CLT
     * @Date 2018/4/22 21:24
     * @param info
     * @param userId
     */
    @Override
    public String insertUserInfo(UserInfo info, String userId) {
        String id = info.getId();
        //新增
        if (StringUtils.isEmpty(id)){
            info.setId(GuidUtil.newGuid());
            if (!StringUtils.isEmpty(userId)) {
                info.setUserId(userId);
            }
            userInfoMapper.insert(info);
            return info.getId();
        }else {
            //更新
            userInfoMapper.updateByPrimaryKeySelective(info);
            return info.getId();
        }
    }




    /**
     * @Title listUserInfo
     * @Description 根据用户id获取用户信息
     * @Author CLT
     * @Date 2018/4/22 14:40
     * @param id
     * @return
     */
    @Override
    public List<UserInfo> listUserInfo(String id) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andIdEqualTo(id);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userInfoList)){
            return userInfoList;
        }
        return null;
    }

    /**
     * @Title listUserInfoByUsreId
     * @Description 通过用户id获取用户信息
     * @Author CLT
     * @Date 2018/4/22 21:48
     * @param userId
     * @return
     */
    @Override
    public List<UserInfo> listUserInfoByUsreId(String userId) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userInfoList)){
            return userInfoList;
        }
        return null;
    }

    /**
     * @Title listUserInfoByUserPhone
     * @Description 通过手机号获取用户信息
     * @Author Lizi
     * @Date 2018/4/24 15:51
     * @param userPhone
     * @return
     */
    @Override
    public List<UserInfo> listUserInfoByUserPhone(String userPhone) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUserPhoneEqualTo(userPhone);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userInfoList)){
            return userInfoList;
        }
        return null;
    }

    /**
     * @Title userPictureSetting
     * @Description 用户头像设置
     * @Author Lizi
     * @Date 2018/4/25 10:50
     * @param userId
     * @param file
     */
    @Override
    public void userPictureSetting(String userId, MultipartFile file, String path) {
        try {
            //获取用户信息
            List<UserInfo> userInfoList = listUserInfoByUsreId(userId);
            UserInfo userInfo = null;
            //头像上传
            if (file != null) {
                //获取上传图片全称
                String originalFileName = file.getOriginalFilename();
                if (StringUtils.isEmpty(originalFileName)){
                    return;
                }
                //获取图片格式
                String pictureFormat = originalFileName.substring(originalFileName.lastIndexOf("."), originalFileName.length());
                //随机数
                String pictureRandom = new Date().getTime() + "_" + new Random().nextInt(1000);
                //组装新的图片全称
                originalFileName = pictureRandom + pictureFormat;//新的文件名
                //判断文件夹是否存在
                File pathFile = new File(path);
                if (!pathFile.getParentFile().exists()) {
                    pathFile.getParentFile().mkdir();
                }
                File targetFile = new File(pathFile, originalFileName);
                //写入到服务器上
                file.transferTo(targetFile);
                //更新
                if (!CollectionUtils.isEmpty(userInfoList)){
                    userInfo = userInfoList.get(0);
                    String userPicture = userInfo.getUserPicture();
                    if (!StringUtils.isEmpty(userPicture)) {
                        userPicture = userPicture.substring(userPicture.lastIndexOf("/"), userPicture.length());
                        File pictureFile = new File(pathFile, userPicture);
                        if (pictureFile.exists()) {
                            pictureFile.delete();
                        }
                    }
                    userInfo.setUserPicture("upload/" + originalFileName);
                    userInfoMapper.updateByPrimaryKeySelective(userInfo);
                }else {
                    //新增
                    userInfo = new UserInfo();
                    userInfo.setId(GuidUtil.newGuid());
                    userInfo.setUserId(userId);
                    userInfo.setUserPicture("upload/" + originalFileName);
                    userInfoMapper.insert(userInfo);
                }
            }else {
                return;
            }
        }catch (Exception e){
            logger.error("写入图片异常",e.getMessage());
            throw new BussinessException("上传图片异常.");
        }
    }

    /**
     * @Title selectUserPage
     * @Description 获取用户列表 管理员使用
     * @Author CLT
     * @Date 2018/5/9 11:31
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public ManagementPageData selectUserPage(Integer pageNo, Integer pageSize) {
        Map<String,Object> params = new HashMap<>();
        Pagination pagination = new Pagination(pageNo,pageSize);
        params.put("pagination",pagination);
        params.put("role", RoleCode.USER.getValue());
        //用户列表
        List<UserInfoVO> userInfoVOList = userInfoMapper.listUsers(params);
        //用户数量
        Long count = userInfoMapper.countUsers(params);
        for (UserInfoVO userInfoVO : userInfoVOList){
            //根据id获取用户的粉丝数,关注数
            String userId = userInfoVO.getConcernedUserId();
            params.put("userId", userId);
            userInfoVO.setTotalConcerns(concernMapper.countConcern(params));
            userInfoVO.setTotalFans(concernMapper.countFans(params));
        }
        ManagementPageData pageData = new ManagementPageData();
        pageData.setUserList(userInfoVOList);
        pageData.setTotalCount(count-1);
        pageData.setPageNo(pageNo);
        pageData.setPageSize(pageSize);
        return pageData;
    }
}
