package com.ericsson.user.service;

import com.ericsson.user.mapper.UserMapper;
import com.ericsson.user.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User queryUserById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
