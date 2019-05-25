package com.ltri.demo;

import com.ltri.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by com.ltri on 2019/05/25 18:42
 */

public class SpringAOPDemo {
    public static void main(String[] args) {
        //通过构造方法注入测试
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-AOP.xml");
        UserService userService = applicationContext.getBean("userServiceAOP", UserService.class);
        userService.findById(1L);
    }
}
