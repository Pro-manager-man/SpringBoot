package com.itany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：何烽
 * Date：2022-11-08 17:23
 * Description：<描述>
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "welcome!";
    }
}
