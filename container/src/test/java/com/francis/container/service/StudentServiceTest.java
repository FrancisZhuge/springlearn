package com.francis.container.service;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author hzzhugequn@corp.netease.com
 */
public class StudentServiceTest {
    @Test
    public void test() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        StudentService studentService = beanFactory.getBean(StudentService.class);
        System.out.println(studentService.getName());
    }
}
