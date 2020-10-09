package com.yc.springcloud81.misconsumer.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//系统用的配置类
@SpringBootConfiguration
public class AppConfig {
    @Bean
    @LoadBalanced//启用ribbon的客户端负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
