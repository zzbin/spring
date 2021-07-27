package com.importDemo.Bean;

import org.springframework.context.annotation.Bean;

public class TestDemo3 {
    @Bean
    public AccountDao4 accountDao4(){
        return new AccountDao4();
    }
}
