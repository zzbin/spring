package com.beanDemo;

import com.beanDemo.bean.Person;
import com.beanDemo.config.AppConfig2;
import com.beanDemo.config.AppConfig3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/**
 * 功能描述: 接受生命周期的回调
 * 任何使用@Bean定义的bean，也可以执行生命周期的回调函数，类似@PostConstruct and @PreDestroy的方法
 * @Param: 
 * @Return: 
 * @Author: zhangzibin
 * @Date: 2021/7/27 16:34
 */
public class MainDemo3 {
    private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig3.class);

    public static void main(String[] args) throws SQLException {
        //从容器中获取日期
        Person person = (Person) context.getBean("person");
        System.out.println(person.getBirthDay());
        context.destroy();
    }
}
