package com.beanDemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.beanDemo.bean.Person;
import com.propertySourceDemo.factory.YamlPropertySourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDate;
import java.util.Date;

//配置类
@Configuration
public class AppConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}
