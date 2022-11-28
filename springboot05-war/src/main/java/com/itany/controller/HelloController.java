package com.itany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：何烽
 * Date：2022-11-16 20:52
 * Description：<描述>
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "何烽");
        return "success";
    }
}
