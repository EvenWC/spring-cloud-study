package com.evan.study.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Administrator
 * @Date: 2018/7/31 22:42
 * @Description: ribbon 方式消费服务
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonServiceApplication.class,args);
    }
}
