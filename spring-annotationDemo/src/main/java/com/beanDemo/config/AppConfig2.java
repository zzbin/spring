package com.beanDemo.config;

import com.beanDemo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

//配置类
@Configuration
public class AppConfig2 {

    @Bean
    public LocalDate localDate(){
        return LocalDate.now();
    }
    //方式一
    @Bean
    public Person person(LocalDate localDate){
        Person person =  new Person();
        person.setBirthDay(localDate);
        return person;
    }

    //方式二
//    @Bean
//    public Person person(){
//        Person person =  new Person();
//        person.setBirthDay(localDate());
//        return person;
//    }

}
