package com.ahbin.slf4j.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JTest06 {

    /*
        绑定log4j
        由于log4j是在slf4j之前出品的日志框架实现
        所以并没有遵循slf4j的API规范
     */
    @Test
    public void test01(){
        Logger logger = LoggerFactory.getLogger(SLF4JTest06.class);
        logger.trace("trace 信息");
        logger.debug("debug 信息");
        logger.info("info 信息");
        logger.warn("warn 信息");
        logger.error("error 信息");
    }

}
