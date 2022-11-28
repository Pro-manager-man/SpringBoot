package com.itany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Author：何烽
 * Date：2022-11-16 22:28
 * Description：<描述>
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Map<String, Object>> findAll() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from t_user");
        return list;
    }
}
