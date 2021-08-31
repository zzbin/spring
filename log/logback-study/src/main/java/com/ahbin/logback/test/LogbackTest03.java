package com.ahbin.logback.test;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest03 {
    @Test
    public void test01(){
        /*
              文件中录入日志
              在文件中，默认是以追加日志的形式做的记录
         */
        Logger logger = LoggerFactory.getLogger(LogbackTest03.class);
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }

}
