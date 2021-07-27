package com.propertySourceDemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//配置类
@Configuration
//@ComponentScan(basePackages = "propertysourcedemo")
public class SpringConfig {
    //通过SPEL表达式注入属性
    @Value("${druid.driverClassName}")
    private String driverClassName;

    @Value("${druid.url}")
    private String url;

    @Value("${druid.username}")
    private String username;

    @Value("${druid.password}")
    private String password;

    //注册Druid数据源连接池
    @Bean
    public DruidDataSource druidDataSource(){
        System.out.println("driverClassName====> " + driverClassName);
        System.out.println("url====> " + url);
        System.out.println("username====> " + username);
        System.out.println("password====> " + password);
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }
}
