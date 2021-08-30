package com.ahbin.slf4j.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JTest07 {

    /*
        集成JDK14(JUL)
     */
    @Test
    public void test01(){
        Logger logger = LoggerFactory.getLogger(SLF4JTest07.class);
        logger.trace("trace 信息");
        logger.debug("debug 信息");
        logger.info("info 信息");
        logger.warn("warn 信息");
        logger.error("error 信息");
    }

}
