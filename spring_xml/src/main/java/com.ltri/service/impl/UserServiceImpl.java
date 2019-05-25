package com.ltri.service.impl;

import com.ltri.service.UserService;

/**
 * create by com.ltri on 2019/05/25 15:37
 */

public class UserServiceImpl implements UserService {

    public void findById(Long id){
        //模拟异常
//        int i = 1/0;
        System.out.println("模拟通过id查询，查询的id为"+id);
    }

    public void findByName(String name) {
        System.out.println("模拟通过name查询，查询的name为"+name);
    }

    public void init() {
        System.out.println("模拟初始化方法");
    }

    public void destroy() {
        System.out.println("模拟销毁方法");
    }
}
