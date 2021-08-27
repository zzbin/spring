package com.ahbin.log4j.test;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;

public class Log4j7Test {

    @Test
    public void test01() throws IOException {
        /*
           日志太多了，不方便管理和维护怎么办
           FileAppender为我们提供了好用的子类来进一步的对于文件输出进行处理
        */
        Logger logger = Logger.getLogger(Log4j7Test.class);
        logger.fatal("fatal 信息");
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }
}
