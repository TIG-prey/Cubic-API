package com.js.jsapiclientsdk.service;

import cn.hutool.http.HttpResponse;
import com.js.jsapiclientsdk.client.JsApiClient;
import com.js.jsapiclientsdk.exception.ApiException;
import com.js.jsapiclientsdk.model.request.BaseRequest;
import com.js.jsapiclientsdk.model.response.ResultResponse;

/**
 * 请求接口
 * @author sakisaki
 * @date 2024/12/19 23:25
 */
public interface ApiService {
    /**
     * 通用请求
     *
     * @param request 要求
     * @return {@link HttpResponse}
     * @throws ApiException 业务异常
     */
    <O, T extends ResultResponse> T request(BaseRequest<O, T> request) throws ApiException;

    /**
     * 通用请求
     *
     * @param jsApiClient api客户端
     * @param request     要求
     * @return {@link T}
     * @throws ApiException 业务异常
     */
    <O, T extends ResultResponse> T request(JsApiClient jsApiClient, BaseRequest<O, T> request) throws ApiException;
}
