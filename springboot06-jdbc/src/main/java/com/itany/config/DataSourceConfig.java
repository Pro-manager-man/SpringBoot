package com.itany.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Author：何烽
 * Date：2022-11-16 21:28
 * Description：<描述>
 */
@Configuration
public class DataSourceConfig {

    @Bean
    //从配置文件中读取属性，并注入给数据源的属性
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return new BasicDataSource();
    }
}
