package com.ltri.demo;

import com.ltri.factory.UserFactory;
import com.ltri.service.UserService;

/**
 * create by com.ltri on 2019/05/25 17:38
 * 模拟通过工厂模式实现
 * 1。
 */

public class FactoryDemo {
    public static void main(String[] args) {
        UserService userService = new UserFactory().getUserService();
        userService.findById(1L);
        userService.findByName("张三");
    }
}
