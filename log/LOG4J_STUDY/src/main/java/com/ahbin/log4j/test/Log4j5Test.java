package com.ahbin.log4j.test;

import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.junit.Test;

import java.io.IOException;

public class Log4j5Test {

    @Test
    public void test01() throws IOException {
        /*
           关于Log4j.properties layout属性的配置
        */
        Logger logger = Logger.getLogger(Log4j5Test.class);
        logger.fatal("fatal 信息");
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }
}
