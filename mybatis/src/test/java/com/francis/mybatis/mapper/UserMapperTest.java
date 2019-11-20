package com.francis.mybatis.mapper;

import com.francis.mybatis.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hzzhugequn@corp.netease.com
 */
public class UserMapperTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper userDao = applicationContext.getBean(UserMapper.class);
        User user = userDao.getUser(1);
        System.out.println(user);
    }
}
