package com.ahbin.log4j.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;

/**
 * Log4j入门案例
 */
public class Log4j1Test {

    @Test
    public void test01() throws IOException {
        /*
           Log4j入门案例
         */
        //加载初始化配置
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(Log4j1Test.class);
        logger.info("info 信息");
    }
}
