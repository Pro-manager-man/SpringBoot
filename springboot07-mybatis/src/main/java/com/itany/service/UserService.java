package com.itany.service;

import com.github.pagehelper.PageInfo;
import com.itany.pojo.User;


import java.util.List;

/**
 * Author：何烽
 * Date：2022-11-17 22:31
 * Description：<描述>
 */
public interface UserService {


    public List<User> findAll();

    public User findById(int id);

    public void add(User user);

    public PageInfo<User> findByPage(int pageNum, int pageSize);
}
