package com.ltri.factory;

import com.ltri.service.UserService;
import com.ltri.service.impl.UserServiceImpl;

/**
 * create by com.ltri on 2019/05/25 16:55
 * 模拟静态工厂
 */

public class StaticFactory {

    public static UserService getUserService() {
        return new UserServiceImpl();
    }
}
