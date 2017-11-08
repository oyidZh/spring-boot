package com.oyid.springJpa.service;

import com.oyid.springJpa.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/6.
 */
public interface UserInterface extends JpaRepository<User,Integer> {

    /**
     * 如果jpa的save，findAll,findOne,delete方法不能满足要求，可以自定义方法
     * 如 下方 getUsersByName
     * @param name
     * @return
     */
    List<User> getUsersByName(String name);
}
