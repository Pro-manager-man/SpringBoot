package com.itany;

import com.itany.pojo.User;
import com.itany.util.JsonUtils;
import com.itany.util.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.*;

import javax.annotation.Resource;

@SpringBootTest
class Springboot09RedisApplicationTests {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    void contextLoads() {
    }

    /**
     * 使用StringRedisTemplate
     */
    @Test
    public void test() {
        ValueOperations<String, String> string = stringRedisTemplate.opsForValue();
        ListOperations<String, String> list = stringRedisTemplate.opsForList();
        SetOperations<String, String> set = stringRedisTemplate.opsForSet();
        ZSetOperations<String, String> zSet = stringRedisTemplate.opsForZSet();
        HashOperations<String, Object, Object> hash = stringRedisTemplate.opsForHash();

        /**
         * 操作String
         */
        //string.set("user", "admin");
        //System.out.println(string.get("user"));

        /**
         * 操作List
         */
        //list.leftPush("names","tom");
        //list.leftPushAll("names", "jack", "bbb", "alice");
        //System.out.println(list.range("names",0,-1));

        /**
         * 存储对象
         */
        User user = new User();
        user.setId(1001);
        user.setUsername("tom");
        user.setPassword("123");

        //将对象转换为json字符串
        String jsonString = JsonUtils.object2Json(user);
        //System.out.println(jsonString);

        //string.set("user",jsonString);

        //将json字符串转换为对象
        String str = string.get("user");
        System.out.println(JsonUtils.json2Object(str, User.class));
    }

    /**
     * 使用RedisTemplate
     */
    @Test
    public void test2() {
        ValueOperations string = redisTemplate.opsForValue();
        string.set("sex", "male");
        System.out.println(string.get("sex"));
    }

    /**
     * 使用工具类RedisUtils
     */
    @Test
    public void test3() {
        redisUtils.set("age", "22", 20);
        System.out.println(redisUtils.get("age"));
    }
}
