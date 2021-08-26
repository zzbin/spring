package com.ahbin.jul.test;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @program: study
 * @description: JUL打印日志信息动态传递
 * @author: ZhangZB
 * @create: 2021-08-22 15:49
 **/
public class JUL2Test {

    @Test
    public void test01(){

        /**
         * 日志入口程序
         * java.util.logging.Logger
         */
        //Logger对象的创建方式，不能直接new对象
        //取得对象的方法参数，需要引入当前类的全路径的字符串（当前我们先这么用，以后根据包结构有Logger父子关系，以后相信介绍）
        Logger logger = Logger.getLogger("com.ahbin.jul.test.JUL2Test");
        /**
         * 输出学生信息 姓名 年龄
         */
        String name = "zs";
        int age = 23;
        logger.info("学生的姓名为："+name+"；年龄为："+age);
        /**
         * 对于输出消息中，字符串的拼接弊端很多
         * 1.麻烦
         * 2.程序效率低
         * 3.可读性不强
         * 4.维护成本高
         *
         * 我们应该使用动态升车鞥数据的方式，生产日志
         * 我们使用的就是占位符的方式来进行操作
         */
        logger.log(Level.INFO, "学生的姓名为：{0}；年龄为：{1}", new Object[]{name, age});

    }
}
