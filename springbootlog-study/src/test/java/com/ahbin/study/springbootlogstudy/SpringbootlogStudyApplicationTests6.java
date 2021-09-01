package com.ahbin.study.springbootlogstudy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootlogStudyApplicationTests6 {

    @Test
    void contextLoads() {
        /*
            由于log4j2性能的强大
            当今市场上越来越多的项目选择使用slf4j+log4j2的组合
            springboot默认使用的是slf4j+logback的组合
            我们可以将默认的logbcak替换成为log4j2

            1.启动器的依赖，间接的依赖logback
                所以需要将之前的环境中，logback的依赖去除掉
            2.添加log4j2的依赖
            3.将log4j2的配置文件log4j2.xml导入到类路径resources下面
         */
        for (int i = 0; i < 1000; i++) {
            Logger logger = LogManager.getLogger(SpringbootlogStudyApplicationTests6.class);
            logger.error("error 信息");
            logger.warn("warn 信息");
            logger.info("info 信息");
            logger.debug("debug 信息");
            logger.trace("trace 信息");
        }
    }

}
