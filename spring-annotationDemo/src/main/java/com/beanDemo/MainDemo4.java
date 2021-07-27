package com.beanDemo;

import com.beanDemo.bean.Person;
import com.beanDemo.config.AppConfig3;
import com.beanDemo.config.AppConfig4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/**
 * 功能描述: 指定bean的scope
 * 如果Person依赖 LocalDate，我们可以通过方法参数实现这个依赖
 * @Param: 
 * @Return: 
 * @Author: zhangzibin
 * @Date: 2021/7/27 16:34
 */
public class MainDemo4 {
    private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig4.class);

    public static void main(String[] args) throws SQLException {
        //从容器中获取日期
        Person person1 = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person");
        System.out.println(person1.getBirthDay());
        System.out.println("person1 == person2:" + (person1 == person2));
    }
}
