package com.ahbin.study.springbootlogstudy;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootlogStudyApplicationTests {

    @Test
    void contextLoads() {
        /*
            入门案例
                springboot日志具体实现级别测试
                默认是info级别
                logback的风格输出（默认使用的是logback的日志实现）
         */
        Logger logger = LoggerFactory.getLogger(SpringbootlogStudyApplicationTests.class);
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }

}
