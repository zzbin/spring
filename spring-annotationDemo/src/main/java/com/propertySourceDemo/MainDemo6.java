package com.propertySourceDemo;

import com.alibaba.druid.pool.DruidDataSource;
import com.propertySourceDemo.config.SpringConfig5;
import com.propertySourceDemo.config.SpringConfig6;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 功能描述: 测试bean的依赖
 * @Author: zhangzibin
 * @Date: 2021/7/27 15:01
 */
public class MainDemo6 {
    private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig6.class);

    public static void main(String[] args) throws SQLException {
        //从容器中获取数据库连接
        Connection connection = (Connection) context.getBean("connection");
//        //获取数据库连接
//        Connection connection = druidDataSource.getConnection();
//        System.out.println(druidDataSource);
        System.out.println(connection.getCatalog());
        System.out.println(connection);
        connection.close();
    }
}
