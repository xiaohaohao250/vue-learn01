package com.bszj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient //发现服务
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Vue01Application {
    public static void main(String[] args) {
        SpringApplication.run(Vue01Application.class, args);
    }
}
