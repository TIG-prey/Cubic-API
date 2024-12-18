package com.js.jsapiclientsdk.config;

import com.js.jsapiclientsdk.client.JsApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sakisaki
 * @version 1.0.0
 * @description JsApi 客户端配置
 * @date 2024-09-13 03:28:17
 */
@Data
@Configuration
@ComponentScan
@ConfigurationProperties("js.api.client")
public class JsApiClientConfig {

    /**
     * 访问密钥
     */
    private String accessKey;
    /**
     * 秘密密钥
     */
    private String secretKey;

    @Bean
    public JsApiClient jsApiClient() {
        return new JsApiClient(accessKey, secretKey);
    }

}