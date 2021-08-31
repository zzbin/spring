package com.ahbin.logback.test;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest02 {
    @Test
    public void test01(){
        /*
            logback配置文件使用
                在resource下面，创建一份配置文件，命名为logback.xml
                一切配置都是在根标签中进行操作的
                <configuration></configuration>
         */
        Logger logger = LoggerFactory.getLogger(LogbackTest02.class);
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }

}
