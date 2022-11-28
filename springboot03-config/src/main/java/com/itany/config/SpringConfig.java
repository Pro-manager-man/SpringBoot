package com.itany.config;

import com.itany.bean.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author：何烽
 * Date：2022-11-11 19:21
 * Description：<描述>
 */
//标注在类上，表示这是一个配置类，相当于以前编写的Spring配置文件
@Configuration
public class SpringConfig {

    //标注在方法上，向容器中添加一个组件，将方法的返回值添加到容器中，方法名作为组件id
    @Bean
    public Address address(){
        Address address = new Address();
        address.setProvince("山东");
        address.setCity("日照");
        return address;
    }
}
