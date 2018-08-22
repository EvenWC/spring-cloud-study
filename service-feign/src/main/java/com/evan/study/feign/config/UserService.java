package com.evan.study.feign.config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/8/1 22:52
 * @Description: feign 接口，使用注解的方式来调用rest 服务
 * <p>
 * FeignClient 的value值对应一个 spring.application.name 为这个值得应用
 */
@FeignClient(value = "user-service")
public interface UserService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<User> findAll();
}
