package com.neuedu.onlineshop.service.impl;

import com.neuedu.onlineshop.mapper.UserMapper;
import com.neuedu.onlineshop.pojo.User;
import com.neuedu.onlineshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        return userMapper.selectByUser(user);
    }
}
