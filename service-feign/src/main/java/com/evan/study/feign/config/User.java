package com.evan.study.feign.config;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2018/8/17 21:36
 * @Description: 数据库实体对象
 */
public class User implements Serializable {

    private Long id;
    private String username;
    private String password;
    private String gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
