package com.ahbin.study.springbootlogstudy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootlogStudyApplicationTests3 {

    @Test
    void contextLoads() {
        /*
            application.properties是springboot的核心配置文件（用来简化开发使用）
            我们也可以通过该配置文件，修改日志相关的配置
         */
        Logger logger = LogManager.getLogger(SpringbootlogStudyApplicationTests3.class);
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }

}
