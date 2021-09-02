package com.ahbin.log4j2.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2Test05 {

    @Test
    public void test01(){
        /*
            日志的拆分
         */
        for (int i = 0; i < 2000; i++) {
            Logger logger = LoggerFactory.getLogger(Log4j2Test05.class);
            logger.error("error 信息");
            logger.warn("warn 信息");
            logger.info("info 信息");
            logger.debug("debug 信息");
            logger.trace("trace 信息");
        }
    }

}
