package com.ahbin.log4j.test;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;

public class Log4j11Test {

    @Test
    public void test01() throws IOException {
        /*
           自定义logger的应用场景
        */
        Logger logger = Logger.getLogger(Log4j11Test.class);
        logger.fatal("fatal 信息");
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");

        /*
            org.apache.log4j.Logger
         */
        Logger logger1 = Logger.getLogger(Logger.class);
        logger1.fatal("fatal 信息--");
        logger1.error("error 信息--");
        logger1.warn("warn 信息--");
        logger1.info("info 信息--");
        logger1.debug("debug 信息--");
        logger1.trace("trace 信息--");
    }
}
