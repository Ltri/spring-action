package com.ltri.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * create by com.ltri on 2019/05/25 21:27
 *
 * 通过spring使用jdbc
 *
 */

public class JdbcTemplateDemo {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        jdbcTemplate.execute("insert into t_user (id,name,money,birth) values (10,'cjx',3000,'1991-01-01')");

    }
}
