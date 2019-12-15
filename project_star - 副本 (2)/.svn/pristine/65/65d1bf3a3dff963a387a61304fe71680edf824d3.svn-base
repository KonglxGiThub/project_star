package com.konglx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konglx.bean.User;
import com.konglx.dao.UserMapper;
import com.konglx.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserMapper userDao;
    
    @Override
    public User getUserById(int userId) {

        return this.userDao.selectByPrimaryKey(userId);

    }

}