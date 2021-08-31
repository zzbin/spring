package com.ahbin.slf4j.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JTest04 {

    @Test
    public void test01(){
        /*
            集成其他日志实现之前
         */
        Logger logger = LoggerFactory.getLogger(SLF4JTest04.class);
        try {
            Class.forName("aaa");
        } catch (ClassNotFoundException e) {
            // 打印栈追踪信息
            logger.info("xxx类中的xxx方法出现了异常，请及时关注信息");
            // e是引用类型对象，不能根前面的{}做有效的字符串拼接
            //logger.info("具体错误是：{}", e);
            //我们不用加{}，直接后面加上异常对象即可
            logger.info("具体错误是：", e);
        }
    }

}
