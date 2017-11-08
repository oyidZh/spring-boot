package com.oyid.mybatis.serviceImpl;

import com.oyid.mybatis.mapper.UserMapper;
import com.oyid.mybatis.service.UserService;
import com.oyid.springJpa.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/7.
 */
@Repository
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
