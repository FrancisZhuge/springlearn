package com.francis.jdbc.service;

import com.francis.jdbc.entity.User;

import java.util.List;

/**
 * @author hzzhugequn@corp.netease.com
 */
public interface UserService {

    void save(User user);

    List<User> getUsers();
}
