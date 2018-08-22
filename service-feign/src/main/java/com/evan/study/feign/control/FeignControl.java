package com.evan.study.feign.control;

import com.evan.study.feign.config.User;
import com.evan.study.feign.config.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/8/1 22:57
 * @Description:
 */
@RequestMapping(value = "feign")
@RestController
public class FeignControl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> findAll() {
        return userService.findAll();
    }

}
