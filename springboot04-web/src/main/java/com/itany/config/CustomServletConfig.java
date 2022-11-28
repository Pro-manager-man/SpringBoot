package com.itany.config;

import com.itany.filter.MyFilter;
import com.itany.listener.MyListener;
import com.itany.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;

/**
 * Author：何烽
 * Date：2022-11-16 12:59
 * Description：<描述>
 */
@Configuration
public class CustomServletConfig {

    @Bean
    public ServletRegistrationBean myServlet() {
        ServletRegistrationBean<MyServlet> registrationBean = new ServletRegistrationBean<>();
        registrationBean.setServlet(new MyServlet());
        registrationBean.addUrlMappings("/myServlet");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyFilter());
        registrationBean.addUrlPatterns("/showLogin", "/test1");
        return registrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener() {
        ServletListenerRegistrationBean<MyListener> registrationBean = new ServletListenerRegistrationBean<>();
        registrationBean.setListener(new MyListener());
        return registrationBean;
    }
}
