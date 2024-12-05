package com.js.jsapiclientsdk;

import com.js.jsapiclientsdk.client.JsApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author JianShang
 * @version 1.0.0
 * @description YuApi 客户端配置
 * @date 2024-09-13 03:28:17
 */
@Configuration
@ConfigurationProperties("yuapi.client")
@Data
@ComponentScan
public class JsApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public JsApiClient yuApiClient() {
        return new JsApiClient(accessKey, secretKey);
    }

}
