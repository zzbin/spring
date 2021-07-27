package com.importDemo.Bean;

import org.springframework.context.annotation.Bean;

public class TestDemo2 {
    @Bean
    public AccountDao3 accountDao3(){
        return new AccountDao3();
    }
}
