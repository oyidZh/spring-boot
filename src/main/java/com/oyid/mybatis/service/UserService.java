package com.oyid.mybatis.service;

import com.oyid.mybatis.mapper.UserMapper;
import com.oyid.springJpa.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/7.
 */
public interface UserService {

    List<User> getAllUsers();
}
