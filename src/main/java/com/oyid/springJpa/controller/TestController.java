package com.oyid.springJpa.controller;

import com.oyid.springJpa.bean.User;
import com.oyid.springJpa.bean.UserProperties;
import com.oyid.springJpa.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2017/11/6.
 */
@RestController
public class TestController {

    @Value("${info}")
    private String info;

    @Autowired
    private UserProperties userProperties;
    @Autowired
    private UserInterface userInterface;

    @RequestMapping("getInfo")
    public String getInfo(@RequestParam(value = "info") String info) {
        return info;
    }

    @RequestMapping("getConfInfo")
    public String getConfigueInfo() {
        return info;
    }

    @RequestMapping("getProInfo")
    public String getPropertiesInfo() {
        return userProperties.getName() + " " + userProperties.getAge() + " " + userProperties.getAddress();
    }

    @GetMapping("getAllUsers")
    public List<User> getAllUsers() {
        return userInterface.findAll();
    }

    @GetMapping("getUserId")
    public User getUserById(@RequestParam(value = "id") Integer id) {
        return userInterface.findOne(id);
    }

    @DeleteMapping("deleteUserId")
    public void deleteUserById(@RequestParam(value = "id") Integer id) {
        userInterface.delete(id);
    }

    @PutMapping("updateUser")
    public User updateUserById(@RequestParam(value = "id") Integer id,
                               @RequestParam(value = "name") String name,
                               @RequestParam(value = "age") String age,
                               @RequestParam(value = "address") String address) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setAddress(address);
        return userInterface.save(user);
    }


    @GetMapping("getUsersByName")
    public List<User> addUser(@RequestParam(value = "name") String name) {
        return userInterface.getUsersByName(name);
    }
}
