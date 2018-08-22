package com.evan.study.service.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2018/8/17 21:36
 * @Description: 数据库实体对象
 */
@Entity
@Table(name = "t_user")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="user_name",nullable = false,length = 50)
    private String userName;
    @Column(name="password",nullable = false,length = 50)
    private String password;
    @Column(name="gender",nullable = false,length = 50)
    private String gender;
}
