package com.lcj.service.impl;

import com.lcj.dao.UserMapper;
import com.lcj.entity.User;
import com.lcj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser(String userId) {
       User user =   userMapper.selectByPrimaryKey(userId);
        return user;
    }

    @Override
    public boolean addUser(User user){
        boolean result = false;
        try {
            userMapper.insert(user);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}
