package com.itany.mapper;

import com.itany.pojo.User;

import java.util.List;

/**
 * Author：何烽
 * Date：2022-11-17 22:20
 * Description：<描述>
 */
public interface UserMapper {

    public List<User> selectAll();

    public User selectById(int id);

    public void insert(User user);
}
