package com.francis.jdbc.service;

import com.francis.jdbc.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author hzzhugequn@corp.netease.com
 */
public class UserServiceTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        User user = new User();
        user.setName("刘备");
        user.setAge(54);
        user.setSex("男");
        userService.save(user);

        List<User> users = userService.getUsers();
        for (User user1:users){
            System.out.println(user1);
        }
    }
}
