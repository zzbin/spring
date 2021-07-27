package com.propertySourceDemo;

import com.alibaba.druid.pool.DruidDataSource;
import com.propertySourceDemo.config.SpringConfig3;
import com.propertySourceDemo.config.SpringConfig4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 功能描述: 读取XML配置文件
 * @Author: zhangzibin
 * @Date: 2021/7/27 15:01
 */
public class MainDemo4 {
    private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig4.class);

    public static void main(String[] args) throws SQLException {
        //从容器中获取数据源
        DruidDataSource druidDataSource = (DruidDataSource) context.getBean("druidDataSource");
        //获取数据库连接
        Connection connection = druidDataSource.getConnection();
        System.out.println(druidDataSource);
        System.out.println(connection);
        connection.close();
    }
}
