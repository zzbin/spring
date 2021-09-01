package com.ahbin.study.springbootlogstudy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootlogStudyApplicationTests4 {

    @Test
    void contextLoads() {
        /*
            将日志输出到文件中
                使用logging.file.path来配置文件路径下的文件夹（logging.file直接配置文件的形式已经过时，不使用）
                在配置的文件夹下，日志文件生成的名字为spring.log
         */
        Logger logger = LogManager.getLogger(SpringbootlogStudyApplicationTests4.class);
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }

}
