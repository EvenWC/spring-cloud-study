package com.evan.study.service.service.impl;

import com.evan.study.service.entity.User;
import com.evan.study.service.repository.UserRepository;
import com.evan.study.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/8/17 22:01
 * @Description:
 */
@Service(value = "userService")
@Transactional(rollbackFor = Exception.class,value = "transactionManager")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;


    @Override
    public Boolean save(User user) {
        return userRepository.save(user) != null;
    }

    @Override
    public void delete(User user) {
         userRepository.delete(user);
    }

    @Override
    public List<User> findAll() {
        Iterator<User> iterator = userRepository.findAll().iterator();
        ArrayList arrayList = new ArrayList();
        while (iterator.hasNext()){
            User next = iterator.next();
            arrayList.add(next);
        }
        return arrayList;
    }
}
