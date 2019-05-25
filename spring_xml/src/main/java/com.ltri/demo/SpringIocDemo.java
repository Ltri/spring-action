package com.ltri.demo;

import com.ltri.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by com.ltri on 2019/05/25 16:27
 * 获取spring容器的2种方法
 * 1。通过BeanFactory获取容器对象
 *      BeanFactory采用延迟加载的方式，即调用方法时才创建
 * 2。通过ApplicationContext获取容器对象
 *      ApplicationContext立即加载，即配置xml时候就加载
 */

public class SpringIocDemo {
    public static void main(String[] args) {
        //1。通过BeanFactory获取容器对象
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-IOC.xml"));
//        UserService userService = beanFactory.getBean("userService", UserService.class);
        //2。通过ApplicationContext获取容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-IOC.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        UserService userService1 = applicationContext.getBean("userService", UserService.class);
        userService.findById(1L);
        System.out.println(userService==userService1);
    }
}
