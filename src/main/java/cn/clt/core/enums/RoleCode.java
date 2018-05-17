package cn.clt.core.enums;

/**
 * @Description 角色权限
 * @Aouthor CLT
 * @Date 2018/05/09 14:50
 */
public enum RoleCode {

    ADMIN("admin"),
    USER("user");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private RoleCode(String value){
        this.value = value;
    }
}
