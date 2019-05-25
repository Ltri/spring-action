package com.ltri.service;

import org.springframework.stereotype.Service;

/**
 * create by com.ltri on 2019/05/25 15:35
 * 本接口不使用@service注解方法，模拟ioc注入的bean配置
 */
@Service
public interface UserService {

    void findById(Long id);

    void findByName(String name);

    void init();

    void destroy();

}
