package cn.clt.core.entity;

import java.util.Date;

public class Fabulous {
    private String id;

    private String articleId;

    private String fabulousUserId;

    private String fabulousUserName;

    private String fabulousUserPicture;

    private Integer status;

    private Date careateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    public String getFabulousUserId() {
        return fabulousUserId;
    }

    public void setFabulousUserId(String fabulousUserId) {
        this.fabulousUserId = fabulousUserId == null ? null : fabulousUserId.trim();
    }

    public String getFabulousUserName() {
        return fabulousUserName;
    }

    public void setFabulousUserName(String fabulousUserName) {
        this.fabulousUserName = fabulousUserName == null ? null : fabulousUserName.trim();
    }

    public String getFabulousUserPicture() {
        return fabulousUserPicture;
    }

    public void setFabulousUserPicture(String fabulousUserPicture) {
        this.fabulousUserPicture = fabulousUserPicture == null ? null : fabulousUserPicture.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCareateTime() {
        return careateTime;
    }

    public void setCareateTime(Date careateTime) {
        this.careateTime = careateTime;
    }
}