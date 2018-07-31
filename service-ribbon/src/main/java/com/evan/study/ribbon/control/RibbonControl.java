package com.evan.study.ribbon.control;

import com.evan.study.ribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2018/7/31 22:52
 * @Description:
 */
@RestController
public class RibbonControl {

    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    public String hello(@RequestParam("name") String name){
        return userService.hello(name);
    }


}
