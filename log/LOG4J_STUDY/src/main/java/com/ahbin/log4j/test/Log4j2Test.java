package com.ahbin.log4j.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;

/**
 * 日志级别输出测试
 */
public class Log4j2Test {

    @Test
    public void test01() throws IOException {
        /*
           日志级别输出测试
           debug是我们在没有进行设置的情况下，默认的日志输出级别
         */
        //加载初始化配置
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(Log4j2Test.class);
        logger.fatal("fatal 信息");
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }
}
