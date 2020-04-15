package com.wxhh.easycommunity.service;

import com.wxhh.easycommunity.dao.UserMapper;
import com.wxhh.easycommunity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }

}
