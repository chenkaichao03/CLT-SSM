package cn.clt.core.vo;

/**
 * @Description
 * @Aouthor CLT
 * @Date 2018/05/04 16:53
 */
public class UserInfoVO {
    //被关注者id
    private String concernedUserId;
    private String userPicture;
    //关注类型 0:无关注，1:已关注,2:互相关注
    private Integer concernType;

    /**用户管理列表(管理员)**/
    private String userName;
    private String userRealName;
    private String userNo;
    private String userPhone;
    private String userAddress;
    private Long totalConcerns;
    private Long totalFans;

    public String getConcernedUserId() {
        return concernedUserId;
    }

    public void setConcernedUserId(String concernedUserId) {
        this.concernedUserId = concernedUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public Integer getConcernType() {
        return concernType;
    }

    public void setConcernType(Integer concernType) {
        this.concernType = concernType;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Long getTotalConcerns() {
        return totalConcerns;
    }

    public void setTotalConcerns(Long totalConcerns) {
        this.totalConcerns = totalConcerns;
    }

    public Long getTotalFans() {
        return totalFans;
    }

    public void setTotalFans(Long totalFans) {
        this.totalFans = totalFans;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }
}
