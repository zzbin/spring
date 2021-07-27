package com.importDemo;

import com.importDemo.Bean.TestDemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(TestDemo.class);  //这里的参数代表要做操作的类
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames){
            System.out.println(name);
        }
    }
}
