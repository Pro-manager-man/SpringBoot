package com.itany.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Author：何烽
 * Date：2022-11-18 16:07
 * Description：<描述>
 */
public class JsonUtils {

    //定义Jackson对象
    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 将对象转换为json字符串
     */
    public static <T> String object2Json(T data) {
        try {
            String jsonString = objectMapper.writeValueAsString(data);
            return jsonString;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将json字符串转换为对象
     */
    public static <T> T json2Object(String jsonString,Class<T> clazz) {
        try {
            T t = objectMapper.readValue(jsonString, clazz);
            return t;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
