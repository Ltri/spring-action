package com.ltri.demo;

import com.ltri.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by com.ltri on 2019/05/25 17:52
 */

public class SpringDiDemo {
    public static void main(String[] args) {
        //通过构造方法注入测试
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-DI.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

        //通过set方法注入测试
        User user2 = applicationContext.getBean("user2", User.class);
        System.out.println(user2);
    }
}
