package cn.clt.core.service.impl;

import cn.clt.core.entity.UserInfo;
import cn.clt.core.entity.UserInfoExample;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.mapper.UserInfoMapper;
import cn.clt.core.service.UserInfoService;
import cn.clt.core.utils.GuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.File;
import java.util.List;

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

    /**
     * @Title insertUserInfo
     * @Description 添加用户
     * @Author CLT
     * @Date 2018/4/22 21:24
     * @param info
     * @param originalFileName
     * @param pathFile
     */
    @Override
    public void insertUserInfo(UserInfo info, String originalFileName, File pathFile) {
        String userId = info.getUserId();
        String id = info.getId();
        if (StringUtils.isEmpty(id)){
            if (StringUtils.isEmpty(userId)){
                throw new BussinessException("用户id不能为空.");
            }
            //新增
            info.setId(GuidUtil.newGuid());
            if (!StringUtils.isEmpty(originalFileName)) {
                info.setUserPicture("upload/" + originalFileName);
            }
            userInfoMapper.insert(info);
        }else {
            //编辑
            List<UserInfo> userInfoList = listUserInfo(id);
            if (!CollectionUtils.isEmpty(userInfoList)){
                //更新
                UserInfo userInfo = userInfoList.get(0);
                //删除之前的图片
                String userPicture = userInfo.getUserPicture();
                if (!StringUtils.isEmpty(userPicture)){
                    userPicture = userPicture.substring(userPicture.lastIndexOf("/"),userPicture.length());
                    File file = new File(pathFile,userPicture);
                    if (file.exists()){
                        file.delete();
                    }
                }
                if (!StringUtils.isEmpty(originalFileName)) {
                    info.setUserPicture("upload/" + originalFileName);
                }
                userInfoMapper.updateByPrimaryKeySelective(info);
            }else {
                throw new BussinessException("用户信息不存在.");
            }
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
     * @Description
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
}
