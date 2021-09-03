package com.ahbin.log4j2.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4j2Test01 {

    @Test
    public void test01(){
        /*
            入门案例
            单纯的使用Log4j2的 门面+实现
            Log4j2和Log4j1提供了相同的日志级别输出
            默认为error级别信息的打印

            ERROR StatusLogger No Log4j 2 configuration file found. Using default configuration
            表示我们还没有建立自己的配置文件
            如果没有建立配置文件，则使用默认的配置
         */
        Logger logger = LogManager.getLogger(Log4j2Test01.class);
        logger.fatal("fatal 信息");
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }

}
