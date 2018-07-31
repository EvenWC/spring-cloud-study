package com.evan.study.service;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2018/7/31 20:17
 * @Description:spring cloud 人员服务
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class,args);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping("hello")
    public String hello(@RequestParam("name") String name){
        return "hello spring cloud "+name +" "+ port;
    }

}
