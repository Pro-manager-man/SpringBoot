package com.itany;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itany.mapper.UserMapper;
import com.itany.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot08MpApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {


    }

    @Test
    public void add() {

        User user = new User();
        user.setUsername("xxxaaa");
        user.setPassword("123");
        userMapper.insert(user);

        System.out.println(user);
    }

    @Test
    public void removeById() {
        userMapper.deleteById(4);
    }

    @Test
    public void modify() {
        User user = new User();
        user.setId(2);
        user.setPassword("666");
        userMapper.updateById(user);
    }

    @Test
    public void findById() {
        System.out.println(userMapper.selectById(2));
    }

    @Test
    public void findByCondition() {
        //定义条件构造器
        QueryWrapper<User> qw = new QueryWrapper<>();
        //qw.eq("username","tom");
        qw.like("username", "%a%");
        //qw.ge("id","4");
        qw.or().ge("id", 4);//表示或者的关系
        List<User> users = userMapper.selectList(qw);
        System.out.println(users);
    }

    @Test
    public void findByPage() {
        Page<User> userPage = userMapper.selectPage(new Page<>(2, 3), new QueryWrapper<User>().gt("id", 1));
        System.out.println(userPage.getTotal());
        System.out.println(userPage.getRecords());

    }
}
