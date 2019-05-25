package com.ltri.service;

/**
 * create by com.ltri on 2019/05/25 15:35
 */
public interface UserService {

    void findById(Long id);

    void findByName(String name);

    void init();

    void destroy();

}
