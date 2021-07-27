package com.beanDemo;

import com.beanDemo.bean.Person;
import com.beanDemo.config.AppConfig;
import com.beanDemo.config.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/**
 * 功能描述: bean的依赖
 * 如果Person依赖 LocalDate，我们可以通过方法参数实现这个依赖
 * @Param: 
 * @Return: 
 * @Author: zhangzibin
 * @Date: 2021/7/27 16:34
 */
public class MainDemo2 {
    private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);

    public static void main(String[] args) throws SQLException {
        //从容器中获取日期
        Person person = (Person) context.getBean("person");
        System.out.println(person.getBirthDay());
    }
}
