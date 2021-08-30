package com.ahbin.slf4j.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;


public class SLF4JTest08 {

    /*
        集成JDK14(JUL)
     */
    @Test
    public void test01(){
        Logger logger = LogManager.getLogger(SLF4JTest08.class);
        logger.trace("trace 信息");
        logger.debug("debug 信息");
        logger.info("info 信息");
        logger.warn("warn 信息");
        logger.error("error 信息");
    }

}
