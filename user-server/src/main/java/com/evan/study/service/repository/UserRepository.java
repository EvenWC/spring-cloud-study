package com.evan.study.service.repository;

import com.evan.study.service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @Auther: Administrator
 * @Date: 2018/8/17 21:56
 * @Description: dao层
 */
public interface UserRepository extends JpaRepository<User,Long> {

}
