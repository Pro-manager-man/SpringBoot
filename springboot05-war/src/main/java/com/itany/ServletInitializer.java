package com.itany;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 要求：
 * 1.继承SpringBootServletInitializer类
 * 2.重新configure()方法
 * 3.调用SpringApplicationBuilder的sources()方法，传入SpringBoot应用的主程序类
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Springboot05WarApplication.class);
    }

}
