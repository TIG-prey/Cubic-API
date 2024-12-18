package com.js.jsapiclientsdk.request;

import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.js.jsapiclientsdk.response.ResultResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 请求类的基类
 * @author sakisaki
 * @date 2024/12/17 23:50
 */
public abstract class BaseRequest<O, T extends ResultResponse> {
    private Map<String, Object> requestParams = new HashMap<>();

    /**
     * 获得请求方法
     * @return {@link String} (Get、POST、PUT、DELETE)
     */
    public abstract String getMethod();

    /**
     * 获取路径
     *
     * @return {@link String}
     */
    public abstract String getPath();

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link T}>
     */
    public abstract Class<T> getResponseClass();

    @JsonAnyGetter
    public Map<String, Object> getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(O requestParams) {
        this.requestParams = new Gson().fromJson(JSONUtil.toJsonStr(requestParams), new TypeToken<Map<String, Object>>() {
        }.getType());
    }
}
