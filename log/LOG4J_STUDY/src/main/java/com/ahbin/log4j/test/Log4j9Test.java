package com.ahbin.log4j.test;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;

public class Log4j9Test {

    @Test
    public void test01() throws IOException {
        /*
           将日志持久化到数据库表中
           创建表结构（tbl_log）（字段的指定可以根据需求进行调整）

        */
        Logger logger = Logger.getLogger(Log4j9Test.class);
        logger.fatal("fatal 信息");
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }
}
