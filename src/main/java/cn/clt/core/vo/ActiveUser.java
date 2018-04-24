package cn.clt.core.vo;

/**
 * @Description 用户信息
 * @Aouthor CLT
 * @Date 2018/04/14 22:44
 */
public class ActiveUser {
    private String userId;
    private String userName;
    private String userInfoId;
    private String userPicture;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }
}
