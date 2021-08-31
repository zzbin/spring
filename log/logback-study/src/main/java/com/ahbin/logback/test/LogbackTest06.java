package com.ahbin.logback.test;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest06 {
    @Test
    public void test01(){
        /*
              在appender中添加过滤器
              以此对日志进行更细粒度的打印
         */
        Logger logger = LoggerFactory.getLogger(LogbackTest06.class);
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }

}
