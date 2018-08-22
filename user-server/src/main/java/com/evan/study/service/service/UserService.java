package com.evan.study.service.service;

import com.evan.study.service.entity.User;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/8/17 22:01
 * @Description:
 */
public interface UserService {

    Boolean save(User user);

    void delete(User user);

    List<User> findAll();
}
