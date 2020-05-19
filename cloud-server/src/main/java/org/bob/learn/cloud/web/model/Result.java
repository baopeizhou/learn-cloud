package org.bob.learn.cloud.web.model;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * HTTP响应
 */
@Slf4j
public class Result implements Serializable,Cloneable {

    private static final Result INVALID_PARAM = new Result("5100000","参数非法");

    private static final Result SUCCESS = new Result("1000000","成功");

    private static final Result SYSTEM_ERROR = new Result("5000001","系统错误");

    private static final Result DEGRADE = new Result("5000002","系统降级");

    private String code;

    private String message;

    private Object data;

    /**
     * 通用响应结果构造器
     * @param code
     * @param message
     */
    public Result(String code, String message){
        this.code=code;
        this.message=message;
        this.data=null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 参数错误工厂方法
     * @return
     */
    public static Result invalidParam(){
        return INVALID_PARAM;
    }

    /**
     * 系统错误工厂方法
     * @return
     */
    public static Result systemError(){
        return SYSTEM_ERROR;
    }

    /**
     * 成功结果工厂方法
     * @param data
     * @return
     */
    public static Result success(Object data) {
        Result result =SUCCESS.clone();
        result.data=data;
        return result;
    }

    /**
     * 降级结果工厂方法
     * @return
     */
    public static Result degrade() {
        return DEGRADE;
    }

    @Override
    public Result clone() {
        try {
            return (Result) super.clone();
        } catch (CloneNotSupportedException e) {
            log.error("对象拷贝异常[{}]",e.getMessage());
            return new Result(this.code,this.message);
        }
    }
}
