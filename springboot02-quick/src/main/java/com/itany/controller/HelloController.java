package com.itany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Author：何烽
 * Date：2022-11-08 17:07
 * Description：<描述>
 */
//@Controller
@RestController //等同于@Controller+@ResponseBody
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello SpringBoot";
    }

    @RequestMapping("/getMap")
    public Map<String,Object> getMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("message", "success");
        map.put("data", "Hello World");
        return map;
    }
}
