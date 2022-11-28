package com.itany.controller;

import com.itany.bean.User;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Author：何烽
 * Date：2022-11-13 20:05
 * Description：<描述>
 */
@Controller
public class TemplateController {

    @RequestMapping("/test1")
    public String test1(Model model) {
        System.out.println("TemplateController.test1");
        model.addAttribute("name", "jack");
        return "success";
    }

    @RequestMapping("/test2")
    public String test2(Model model) {
        model.addAttribute("hello", "<mark>您好</mark>");

        model.addAttribute("id", "mydiv");
        model.addAttribute("title", "this is a div");

        model.addAttribute("age", 21);
        model.addAttribute("role", "student");
        model.addAttribute("names", Arrays.asList("tom", "jack", "alice"));

        User user = new User(1001, "tom", 21);
        model.addAttribute("user", user);
        return "result";
    }

    @RequestMapping("/modify")
    @ResponseBody
    public String modify(User user) {
        System.out.println("TemplateController.modify:" + user);
        return "修改成功";
    }

    @RequestMapping("/test3")
    public String test3(Model model, HttpSession session) {
        model.addAttribute("user", new User(1001, "tom", 21));
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1001, "tom", 21));
        users.add(new User(1002, "jack", 21));
        users.add(new User(1003, "alice", 21));
        model.addAttribute("users", users);

        session.setAttribute("sex", "female");
        session.getServletContext().setAttribute("hobby", "game");

        model.addAttribute("birthday", new Date());


        return "list";
    }

    @RequestMapping("/findUser")
    @ResponseBody
    public String findUser(String username) {
        System.out.println("TemplateController.findUser:" + username);
        return "success";
    }
}
