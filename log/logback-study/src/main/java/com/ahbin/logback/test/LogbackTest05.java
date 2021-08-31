package com.ahbin.logback.test;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest05 {
    @Test
    public void test01(){
        /*
              日志拆分和归档压缩
         */
        for (int i = 0; i < 1000; i++) {
            Logger logger = LoggerFactory.getLogger(LogbackTest05.class);
            logger.error("error 信息");
            logger.warn("warn 信息");
            logger.info("info 信息");
            logger.debug("debug 信息");
            logger.trace("trace 信息");
        }

    }

}
