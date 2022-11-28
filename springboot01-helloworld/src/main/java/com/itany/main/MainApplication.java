package com.itany.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author：何烽
 * Date：2022-11-07 22:08
 * Description：<描述>
 */
@SpringBootApplication
@ComponentScan("com.itany.controller")
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
