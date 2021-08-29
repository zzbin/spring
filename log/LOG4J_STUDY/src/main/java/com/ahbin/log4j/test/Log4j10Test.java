package com.ahbin.log4j.test;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;

public class Log4j10Test {

    @Test
    public void test01() throws IOException {
        /*
           log4j的自定义logger
        */
        Logger logger = Logger.getLogger(Log4j10Test.class);
        logger.fatal("fatal 信息");
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }
}
