package com.itany.controller;

import com.github.pagehelper.PageInfo;
import com.itany.pojo.User;
import com.itany.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author：何烽
 * Date：2022-11-17 22:35
 * Description：<描述>
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        List<User> users = userService.findAll();
        return users;
    }

    @RequestMapping("/findById")
    public User findById(int id) {
        User user = userService.findById(id);
        return user;
    }

    @RequestMapping("/add")
    public User add(User user) {
        userService.add(user);
        return user;
    }

    @RequestMapping("/findByPage")
    public PageInfo findByPage(int pageNum) {
        return userService.findByPage(pageNum,3);
    }
}
