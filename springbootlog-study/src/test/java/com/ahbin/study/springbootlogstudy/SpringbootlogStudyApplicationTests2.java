package com.ahbin.study.springbootlogstudy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootlogStudyApplicationTests2 {

    @Test
    void contextLoads() {
        /*
            使用log4j2的日志实现
            观察桥接器是否起作用
         */
        Logger logger = LogManager.getLogger(SpringbootlogStudyApplicationTests2.class);
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }

}
