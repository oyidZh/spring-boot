package com.oyid.mybatis.controller;

import com.oyid.mybatis.serviceImpl.UserServiceImpl;
import com.oyid.springJpa.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/11/7.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
