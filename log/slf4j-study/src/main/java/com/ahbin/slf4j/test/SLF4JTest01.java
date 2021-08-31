package com.ahbin.slf4j.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JTest01 {

    @Test
    public void test01(){
        /*
            入门案例
                SLF4J对日志的级别划分
                trace、debug、INFO、warn、error五个级别
                trace 日志追踪信息
                debug 日志详细信息
                INFO 日志的关键信息  默认的打印级别
                warn 日志警告信息
                error 日志错误信息

                在没有任何其他日志实现框架集成的基础之上，slf4j使用的就是自带的框架slf4j-simple
                slf4j-simple也必须以单独依赖的形式导入进来
         */
        Logger logger = LoggerFactory.getLogger(SLF4JTest01.class);
        logger.trace("trace 信息");
        logger.debug("debug 信息");
        logger.info("info 信息");
        logger.warn("warn 信息");
        logger.error("error 信息");
    }

}
