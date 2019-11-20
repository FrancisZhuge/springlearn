package com.francis.mybatis.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author hzzhugequn@corp.netease.com
 */
@Data
@Alias("user")
public class User {

    private Integer id;

    private String name;

    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
