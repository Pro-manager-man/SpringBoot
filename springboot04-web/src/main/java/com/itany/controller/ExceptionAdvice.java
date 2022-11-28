package com.itany.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Author：何烽
 * Date：2022-11-16 12:45
 * Description：<描述>
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(ArithmeticException.class)
    public String arithmetic(Exception e) {
        System.out.println("警报，程序出现异常，发短信：" + e.getMessage());
        return "error/5xx";
    }

    @ExceptionHandler(Exception.class)
    public String exception(Exception e) {
        System.out.println("警报，程序出现异常，发邮件：" + e.getMessage());
        return "error/5xx";
    }
}
