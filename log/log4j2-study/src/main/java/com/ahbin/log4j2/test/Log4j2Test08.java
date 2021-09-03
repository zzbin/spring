package com.ahbin.log4j2.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2Test08 {

    @Test
    public void test01(){
        /*
            异步日志实现
            方式2：使用AsyncLogger的方式
            混合异步：
                可以在应用中同时使用同步日志和异步日志，这使得日志的配置及输出会更加的灵活
         */
        for (int i = 0; i < 2000; i++) {
            Logger logger = LoggerFactory.getLogger(Log4j2Test08.class);
            logger.error("error 信息");
            logger.warn("warn 信息");
            logger.info("info 信息");
            logger.debug("debug 信息");
            logger.trace("trace 信息");
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println("-----------------");
        }
    }

}
