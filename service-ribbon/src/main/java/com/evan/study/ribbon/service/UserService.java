package com.evan.study.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Administrator
 * @Date: 2018/7/31 22:43
 * @Description:
 */
@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public String hello(String name){
        return restTemplate.getForObject("http://user-service/hello?name="+name,String.class);
    }


}
