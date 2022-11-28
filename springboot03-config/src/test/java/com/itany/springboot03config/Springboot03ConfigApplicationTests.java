package com.itany.springboot03config;

import com.itany.bean.Address;
import com.itany.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot03ConfigApplicationTests {

    @Autowired
    User user;

    @Autowired
    Address address;

    @Test
    void contextLoads() {
        System.out.println(address);
    }

}
