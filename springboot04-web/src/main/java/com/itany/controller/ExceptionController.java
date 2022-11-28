package com.itany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：何烽
 * Date：2022-11-16 12:36
 * Description：<描述>
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/test1")
    public String test1(int num) {
        int i = 5 / num;
        return "success";
    }

    @RequestMapping("/test2")
    public String test2() {
        String str = null;
        str.toString();
        return "success";
    }
}
