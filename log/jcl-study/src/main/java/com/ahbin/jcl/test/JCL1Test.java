package com.ahbin.jcl.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * @program: study
 * @description:
 * @author: ZhangZB
 * @create: 2021-08-29 22:15
 **/
public class JCL1Test {

    @Test
    public void test01(){
        /*
            我们暂时没有导入第三方的日志框架，例如log4j
            默认的情况下，会使用JUL日志框架做日志的记录操作
            JCL使用原则
                如果有log4j，优先使用log4j
                如果没有任何第三方日志框架的时候，我们使用的就是JUL

         */
        Log log = LogFactory.getLog(JCL1Test.class);
        log.info("info 信息");
        log.error("error 信息");
    }

}
