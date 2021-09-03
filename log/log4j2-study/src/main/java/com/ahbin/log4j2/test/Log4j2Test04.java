package com.ahbin.log4j2.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2Test04 {

    @Test
    public void test01(){
        /*
            将日志输出到文件中
         */
        Logger logger = LoggerFactory.getLogger(Log4j2Test04.class);
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }

}
