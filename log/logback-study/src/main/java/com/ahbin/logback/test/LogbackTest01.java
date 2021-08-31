package com.ahbin.logback.test;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest01 {
    @Test
    public void test01(){
        /*
            入门案例
            logback有5种级别的日志输出
            trace < debug < info < warn < error
            默认debug
         */
        Logger logger = LoggerFactory.getLogger(LogbackTest01.class);
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }

}
