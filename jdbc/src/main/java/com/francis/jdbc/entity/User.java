package com.francis.jdbc.entity;

import lombok.Data;

/**
 * @author hzzhugequn@corp.netease.com
 */
@Data
public class User {
    private int id;
    private String name;
    private int age;
    private String sex;

    public User() {
    }

    public User(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
