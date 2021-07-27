package com.propertySourceDemo;

import com.alibaba.druid.pool.DruidDataSource;
import com.propertySourceDemo.config.SpringConfig;
import com.propertySourceDemo.config.SpringConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 功能描述: spring4.3之前
 * 除了使用@PropertySource注解之外，还要手动注册一个资源文件解析器PropertySourcesPlaceholderConfigurer到IOC容器中。
 * 并且如果使用Bean注解注册资源文件解析器，方法要是static方法。
 * @Author: zhangzibin
 * @Date: 2021/7/27 15:01
 */
public class MainDemo2 {
    private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig2.class);

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
