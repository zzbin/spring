package com.beanDemo.config;

import com.beanDemo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;

//配置类
@Configuration
public class AppConfig4 {

    @Bean
    public LocalDate localDate(){
        return LocalDate.now();
    }

    //方式一
    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Person person(LocalDate localDate){
        Person person =  new Person();
        person.setBirthDay(localDate);
        return person;
    }

}
