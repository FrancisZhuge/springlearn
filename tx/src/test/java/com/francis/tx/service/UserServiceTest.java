package com.francis.tx.service;

import com.francis.tx.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hzzhugequn@corp.netease.com
 */
public class UserServiceTest {

    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.save(new User("李四err", 11, "男"));
    }
}
