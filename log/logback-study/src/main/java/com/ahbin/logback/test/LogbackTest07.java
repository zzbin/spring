package com.ahbin.logback.test;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest07 {
    @Test
    public void test01(){
        /*
              按照当前的代码执行顺序
              代码可定是按照从上向下的顺序执行
              上面的代码完全执行完毕后，才会执行下面的代码

              由此得出会出现的问题
                只要是在记录日志，那么系统本身的功能就处于一种停滞的状态
                当日志记录完毕后，才会执行其他的代码
                如果日志记录量非常庞大的话，那么我们对于系统本身业务代码的执行效率会非常低

                所以logback为我们提供了异步日志的功能
         */
        //
        Logger logger = LoggerFactory.getLogger(LogbackTest07.class);
        //日志打印操作
        for (int i = 0; i < 100; i++) {
            logger.error("error 信息");
            logger.warn("warn 信息");
            logger.info("info 信息");
            logger.debug("debug 信息");
            logger.trace("trace 信息");
        }
        //系统本身业务相关其他操作
        System.out.println("1--------------------");
        System.out.println("2--------------------");
        System.out.println("3--------------------");
        System.out.println("4--------------------");
        System.out.println("5--------------------");
    }

}
