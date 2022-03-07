package com.hysea.hyseaappapi.utils;

public class ReturnObject {
    //响应吗
    private Integer code;
    //响应信息
    private String message;
    //响应数据
    private Object result;

    public ReturnObject() {
    }

    public ReturnObject(Integer code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }


    public ReturnObject(Integer code, String message) {
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

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}