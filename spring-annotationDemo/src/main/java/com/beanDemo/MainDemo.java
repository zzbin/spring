package com.beanDemo;

import com.alibaba.druid.pool.DruidDataSource;
import com.beanDemo.bean.Person;
import com.beanDemo.config.AppConfig;
import com.propertySourceDemo.config.SpringConfig5;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

/**
 * 功能描述: 定义一个普通的bean
 * @Param:
 * @Return: 
 * @Author: zhangzibin
 * @Date: 2021/7/27 17:52
 */
public class MainDemo {
    private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) throws SQLException {
        //从容器中获取日期
        Person person = (Person) context.getBean("person");
        System.out.println(person.getBirthDay());
    }
}
