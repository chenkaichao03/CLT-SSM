package cn.clt.core.enums;

/**
 * @Description 关注状态
 * @Aouthor CLT
 * @Date 2018/05/09 9:38
 */
public enum ConcernCode {

    NO_CONCERN(0,"末关注"),
    CONCERN(1,"已关注"),
    MUTUAL_CONCERN(2,"互相关注");

    private Integer code;
    private String message;

    private ConcernCode(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
