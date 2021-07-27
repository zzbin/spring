package com.propertySourceDemo;

import com.alibaba.druid.pool.DruidDataSource;
import com.propertySourceDemo.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 功能描述: 错误示例
 * @Author: zhangzibin
 * @Date: 2021/7/27 15:01
 */
public class MainDemo {
    private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

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
