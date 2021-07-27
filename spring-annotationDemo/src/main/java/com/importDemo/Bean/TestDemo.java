package com.importDemo.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import({TestDemo2.class, Myclass.class, Myclass2.class})
public class TestDemo {
    @Bean
    public AccountDao2 accountDao2(){
        return new AccountDao2();
    }
}