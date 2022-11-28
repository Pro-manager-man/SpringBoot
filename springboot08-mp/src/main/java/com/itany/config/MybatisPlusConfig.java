package com.itany.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.itany.baen.SqlInjector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Author：何烽
 * Date：2022-11-18 0:06
 * Description：<描述>
 */
@Configuration
@MapperScan("com.itany.mapper")
public class MybatisPlusConfig {
    @Bean
    public SqlInjector sqlInjector(){
        return new SqlInjector();
    }

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() {
        return new DruidDataSource();
    }
}
