package cn.clt.core.enums;

/**
 * @Description 状态码
 * @Aouthor CLT
 * @Date 2018/04/02 17:52
 */
public enum Code {
    OK(200),ERROR(404);

    private Integer value;

    private Code(Integer value){
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
