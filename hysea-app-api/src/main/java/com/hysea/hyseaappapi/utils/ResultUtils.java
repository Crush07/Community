package com.hysea.hyseaappapi.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @author Nuisance
 * @date 2021/4/28 15:56
 * 请求返回封装 类
 */
@Service
public class ResultUtils {

    /**
     * 成功 状态码：200 携带 提示、返回值
     *
     * @param message 提示信息
     * @param result 返回结果
     * @return  String
     */
    public String SUCCESS(String message, Object result) {
        return JSONObject.toJSONString(new ReturnObject(200, message, result));
    }

    /**
     * 警告返回 code:400 携带提示 和 返回值
     * @param message 提示信息
     * @param result 返回值
     * @return String
     */
    public String WARNING(String message, Object result) {
        return JSONObject.toJSONString(new ReturnObject(400, message, result));
    }

    /**
     * 警告返回 code:400 携带提示 不携带返回值
     * @param message  提示信息
     * @return String
     */
    public String WARNING(String message) {
        return JSONObject.toJSONString(new ReturnObject(400, message));
    }

    /**
     * 未授权 code 401 携带提示 和 返回值
     * @param message 提示信息
     * @param result  返回值
     * @return String
     */
    public String UNAUTHORIZED(String message, Object result) {
        return JSONObject.toJSONString(new ReturnObject(401, message, result));
    }

    /**
     * 未授权 code 401 携带提示
     * @param message 提示信息
     * @return String
     */
    public String UNAUTHORIZED(String message) {
        return JSONObject.toJSONString(new ReturnObject(401, message));
    }

    /**
     * 已接收请求并明白请求，但未执行或者无权限相关操作。给与前端提示。
     * @param message 提示信息
     * @return String
     */
    public String NON_EXECUTION(String message) {
        return JSONObject.toJSONString(new ReturnObject(403,message));
    }

    /**
     * 已接收请求并明白请求，但未执行或者无权限相关操作。给与前端提示。
     * @param message 提示信息
     * @return String
     */
    public String NON_EXECUTION(String message,Object result) {
        return JSONObject.toJSONString(new ReturnObject(403,message,result));
    }

    /**
     * 仅更新 TOKEN可用
     * @param token token
     * @return String
     */
    public String UPDATE_TOKEN(String token){
        return JSONObject.toJSONString(new ReturnObject(222,token));
    }
}
