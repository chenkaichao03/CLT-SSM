package cn.clt.core.entity;

public class Concern {
    private String id;

    private String concernUser;

    private String concernedUser;

    private Integer concernType=0;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getConcernUser() {
        return concernUser;
    }

    public void setConcernUser(String concernUser) {
        this.concernUser = concernUser == null ? null : concernUser.trim();
    }

    public String getConcernedUser() {
        return concernedUser;
    }

    public void setConcernedUser(String concernedUser) {
        this.concernedUser = concernedUser == null ? null : concernedUser.trim();
    }

    public Integer getConcernType() {
        return concernType;
    }

    public void setConcernType(Integer concernType) {
        this.concernType = concernType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}