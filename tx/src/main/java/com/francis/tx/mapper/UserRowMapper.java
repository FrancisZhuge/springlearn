package com.francis.tx.mapper;

import com.francis.tx.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author hzzhugequn@corp.netease.com
 */
public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("sex"));
    }
}
