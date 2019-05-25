package com.ltri.factory;

import com.ltri.service.impl.UserServiceImpl;
import org.springframework.beans.factory.BeanFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * create by com.ltri on 2019/05/25 16:47
 * 模拟工厂类
 */
public class UserFactory {
    private static Properties properties;

    //可通过配置properties来读取bean名来解耦
    static {
        properties = new Properties();
        InputStream inputStream = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            assert inputStream != null;
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public UserServiceImpl getUserService() {
        return new UserServiceImpl();
    }

    public static Object getBean(String beanName) throws Exception {
        String path = properties.getProperty(beanName);
        System.out.println(path);
        return Class.forName(path).getDeclaredConstructor().newInstance();
    }
}
