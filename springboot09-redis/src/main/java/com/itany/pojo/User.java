package com.itany.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Author：何烽
 * Date：2022-11-18 16:04
 * Description：<描述>
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;

}
