package com.ahbin.study.springbootlogstudy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootlogStudyApplicationTests5 {

    @Test
    void contextLoads() {
        /*
            如果是需要配置日志拆分等相对高级的功能
            那么application.properties就达不到要求了
            需要使用日志实现相应的配置文件

            例如我们现在使用的是logback日志实现
            那么就需要在类路径resource下，配置logback.xml
         */
        for (int i = 0; i < 1000; i++) {
            Logger logger = LogManager.getLogger(SpringbootlogStudyApplicationTests5.class);
            logger.error("error 信息");
            logger.warn("warn 信息");
            logger.info("info 信息");
            logger.debug("debug 信息");
            logger.trace("trace 信息");
        }
    }

}
