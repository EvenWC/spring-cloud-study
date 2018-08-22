package com.evan.study.service.controller;

import com.evan.study.service.entity.User;
import com.evan.study.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/8/17 22:13
 * @Description: 提供restful风格的服务
 */
@RestController
@EnableEurekaClient
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void delete(@RequestBody User user){
        userService.delete(user);
    }

    @RequestMapping(value = "/post",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Boolean save(@RequestBody User user){
        return userService.save(user);
   }
}
