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
public class JCL2Test {

    @Test
    public void test01(){
        /*
            导入log4j依赖，继续测试原有测序
            总结：
                我们上一个案例，使用的是JUL,但是在集成了log4j环境后，使用的又是log4j
                通过测试观察，虽然日志框架发生了变化，但是代码完全没有改变
            日志门面技术的好处：
                门面技术是面向接口的开发，不再依赖具体的实现类，减少代码的耦合性
                可以根据实际需求，灵活的切换日志框架
                统一的API,方便开发者学习和使用
                统一的配置管理便于项目日志的维护工作
         */
        Log log = LogFactory.getLog(JCL2Test.class);
        log.info("info 信息");
        log.error("error 信息");
    }

}
