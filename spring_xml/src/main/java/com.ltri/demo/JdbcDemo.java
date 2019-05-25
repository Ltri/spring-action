package com.ltri.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * create by com.ltri on 2019/05/25 15:38
 *
 * 模拟没用spring框架 原始的数据库连接操作
 * 缺点：
 * 1.耦合大、依赖强、代码写死后续换驱动之类麻烦。
 */

public class JdbcDemo {
    public static void main(String[] args) throws Exception {
        //1.注册数据库驱动
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        //2.获取数据库连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring-action?useSSL=false&serverTimezone=GMT%2B8",
                "root","root@563");
        //3.获取PreparedStatement对象
        PreparedStatement preparedStatement = connection.prepareStatement("select * from t_user");
        //4.执行sql语句
        ResultSet resultSet = preparedStatement.executeQuery();
        //5.打印结果
        while (resultSet.next()){
            //打印id
            System.out.println(resultSet.getString("id"));
            //打印name
            System.out.println(resultSet.getString("name"));
            //打印money
            System.out.println(resultSet.getString("money"));
        }
        //6.关闭资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
