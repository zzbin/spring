package com.ahbin.jul.test;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @program: study
 * @description: 入门案例
 * @author: ZhangZB
 * @create: 2021-08-22 15:49
 **/
public class JUL1Test {
    @Test
    public void test01(){
        //入门案例
        /**
         * 日志入口程序
         * java.util.logging.Logger
         */
        //Logger对象的创建方式，不能直接new对象
        //取得对象的方法参数，需要引入当前类的全路径的字符串（当前我们先这么用，以后根据包结构有Logger父子关系，以后相信介绍）
        Logger logger = Logger.getLogger("com.ahbin.jul.test.JULTest");
        /**
         * 对于日志的输出，有两种方式
         * 第一种方式：
         *    直接调用日志级别相关的方法，方法中传递日志输出信息
         *    假设现在我们要输出info级别的日志信息
         */
        logger.info("输出info信息");
        /**
         * 第二种方式
         *    调用通用的log方法，然后在里面通过Level类型来定意思日志的级别参数，以及搭配日志输出信息的参数
         */
        logger.log(Level.INFO, "输出info信息2");
    }
}
