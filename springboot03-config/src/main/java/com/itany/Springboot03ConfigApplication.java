package com.itany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//加载外部的spring配置文件
//@ImportResource({"classpath:config/spring.xml"})
@SpringBootApplication
public class Springboot03ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03ConfigApplication.class, args);
    }

}
