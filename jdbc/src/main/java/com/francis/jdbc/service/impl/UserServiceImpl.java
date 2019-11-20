package com.francis.jdbc.service.impl;

import com.francis.jdbc.entity.User;
import com.francis.jdbc.mapper.UserMapper;
import com.francis.jdbc.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author hzzhugequn@corp.netease.com
 */
public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(User user) {
        jdbcTemplate.update("insert into user(name, age, sex) values (?,?,?)",
                user.getName(), user.getAge(), user.getSex());
    }

    @Override
    public List<User> getUsers() {
        return jdbcTemplate.query("select * from user", new UserMapper());
    }
}
