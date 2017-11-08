package com.oyid.mybatis.mapper;

import com.oyid.springJpa.bean.User;

import java.util.List;

/**
 * Created by Administrator on 2017/11/7.
 */
public interface UserMapper {

    //@Select("SELECT * FROM USER")
    List<User> getAllUsers();
}
