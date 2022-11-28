package com.itany.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;

import java.io.Serializable;

/**
 * Author：何烽
 * Date：2022-11-18 0:16
 * Description：<描述>
 */

//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
@Data
public class User implements Serializable {


    private Integer id;
    private String username;
    private String password;


}
