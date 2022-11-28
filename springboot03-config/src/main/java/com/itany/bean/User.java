package com.itany.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Author：何烽
 * Date：2022-11-09 18:05
 * Description：<描述>
 */
@Component
//加载外部的属性文件
@PropertySource({"classpath:config/user.properties"})
@ConfigurationProperties(prefix = "user")
public class User {

    private String username;
    private Integer age;
    private Boolean status;
    private Date birthday;
    private Address address;
    private List<String> lists;
    private Map<String, Object> maps;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", status=" + status +
                ", birthday=" + birthday +
                ", address=" + address +
                ", lists=" + lists +
                ", maps=" + maps +
                '}';
    }
}
