package com.ahbin.slf4j.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JTest02 {

    @Test
    public void test01(){
        /*
            我们输出动态的信息时
            也可以使用占位符的形式来代替字符串的拼接

            我们有些时候输出的日志信息，需要我们搭配动态的数据
            有可能是信息，有可能是数据库表中的数据
            总之我们这样做最大的好处就是能够让日志打印变得更加灵活
            如果是通过拼接字符串的形式，不仅麻烦，而且重要的是可读性差
            我们的日志打印的支持以替代符的形式做日志信息拼接的
            一般情况下，几乎所有的日志实现产品，都会提供这种基础功能
         */
        Logger logger = LoggerFactory.getLogger(SLF4JTest02.class);
        String name = "zhangsan";
        int age = 23;
        logger.info("学生信息-姓名：" + name + ",年龄：" + age);
        logger.info("学生信息-姓名：{},年龄：{}", new Object[]{name, age});
        logger.info("学生信息-姓名：{},年龄：{}", name,  age);
        logger.info("学生信息-姓名：{1},年龄：{2}", name,  age);  //这种方式不支持
    }

}
