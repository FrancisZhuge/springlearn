package com.francis.mybatis.mapper;

import com.francis.mybatis.entity.User;

/**
 * @author hzzhugequn@corp.netease.com
 */
public interface UserMapper {

    void insertUser(User user);

    User getUser(Integer id);
}
