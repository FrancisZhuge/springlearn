package com.francis.tx.service.impl;

import com.francis.tx.entity.User;
import com.francis.tx.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author hzzhugequn@corp.netease.com
 */
public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(User user) throws Exception {
        jdbcTemplate.update("insert into user(name, age, sex) values (?,?,?)", new Object[]{user.getName(), user.getAge(), user.getSex()});
        someException(user);
    }

    private void someException(User user) throws Exception {
        if (user.getName().contains("err"))
            throw new Exception("some err");
    }
}
