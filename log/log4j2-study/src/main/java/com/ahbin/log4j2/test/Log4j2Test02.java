package com.ahbin.log4j2.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4j2Test02 {

    @Test
    public void test01(){
        /*
           使用配置文件
           log4j2是参考logback创作出来的，所以配置文件也是使用XML
            log4j2同样是默认加载类路径（resources）下的log4j2.xml文件中的配置
            根标签，所有日志相关信息，都是根标签中进行配置
            <Configuration xmlns="http://logging.apache.org/log4j/2.0/config">
            </Configuration>
         */
        Logger logger = LogManager.getLogger(Log4j2Test02.class);
        logger.fatal("fatal 信息");
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }

}
