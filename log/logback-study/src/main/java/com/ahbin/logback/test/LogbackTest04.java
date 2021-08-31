package com.ahbin.logback.test;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest04 {
    @Test
    public void test01(){
        /*
              将日志输出成为一个html文件
                这个html文件是有logback来帮我们控制样式
                内容和格式由我们自己定义
         */
        Logger logger = LoggerFactory.getLogger(LogbackTest04.class);
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }

}
