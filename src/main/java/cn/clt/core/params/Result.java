package cn.clt.core.params;

import cn.clt.core.enums.Code;
import cn.clt.core.enums.Status;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @Description 数据集合Json格式
 * @Aouthor CLT
 * @Date 2018/04/02 17:55
 */
public class Result {

    private Status status;
    private Integer code;
    private String message;
    private Object object;

    public Result(){}

    public Result(Status status, Integer code, String message, Object result){
        this.status = status;
        this.code = code;
        this.message = message;
        this.object = result;
    }

    public static String ok(Object result){
        return new Result(Status.OK, Code.OK.getValue(), "", result).toString();
    }

    public static String ok(Integer code, String message, Object result){
        return new Result(Status.OK, code, message, result).toString();
    }

    public static String error(String message){
        return new Result(Status.ERROR, Code.ERROR.getValue(), message, null).toString();
    }

    public static String error(Integer code, String message, Object result){
        return new Result(Status.ERROR, code, message, result).toString();
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this, SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteNullNumberAsZero,
                SerializerFeature.WriteNullListAsEmpty, SerializerFeature.WriteMapNullValue);
    }
}
