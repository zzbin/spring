package com.ahbin.jul.test;

import org.junit.Test;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * @program: study
 * @description: 默认配置文件
 * @author: ZhangZB
 * @create: 2021-08-22 15:49
 **/
public class JUL8Test {

    @Test
    public void test01() throws IOException {
        /*
            如果我们没有自己添加配置文件，则会使用系统默认的配置文件，
            这个配置文件位置：
            Logger logger = Logger.getLogger("com.ahbin.jul.test.JUL8Test");
            owner.readPrimordialConfiguration();
            readConfiguration();
            java.home --> 找到jre文件夹--> lib -->logging.properties
         */
        //日志记录器
        Logger logger = Logger.getLogger("com.ahbin.jul.test.JUL8Test");
        Logger logger1 = Logger.getLogger("com.ahbin.jul.test");
        Logger logger2 = Logger.getLogger("com.ahbin.jul.test.JUL7Test");

        //父节点是最近一个上级路径对应的logger
        System.out.println(logger2.getParent() == logger1);
        System.out.println(logger2.getParent() == logger);

        // 如果是自定义的最上层的父节点，那么它的父节点为java.util.logging.LogManager$RootLogger，父节点名称为空
        // LogManager$RootLogger可以被称之为所有logger对象的顶层logger
        System.out.println("logger的父Logger引用为："+logger.getParent()+";名称为"+logger.getName()
                +"; 父亲的名称为"+logger.getParent().getName());
        System.out.println("logger1的父Logger引用为："+logger1.getParent()+";名称为"+logger1.getName()
                +"; 父亲的名称为"+logger1.getParent().getName());
        System.out.println("logger2的父Logger引用为："+logger2.getParent()+";名称为"+logger2.getName()
                +"; 父亲的名称为"+logger2.getParent().getName());
        /*
            父子结构的作用：
                父亲所做的设置，也能够同时作用于儿子
                对logger1做日志打印相关的设置，然后我们使用logger2进行日志的打印
         */
        //父亲做的设置
        logger1.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        SimpleFormatter formatter = new SimpleFormatter();
        handler.setFormatter(formatter);
        logger1.addHandler(handler);
        handler.setLevel(Level.ALL);
        logger1.setLevel(Level.ALL);

        //儿子做打印
        logger2.severe("severe 信息");
        logger2.warning("warning 信息");
        logger2.info("info 信息");
        logger2.config("config 信息");
        logger2.fine("fine 信息");
        logger2.finer("finer 信息");
        logger2.finest("finest 信息");

    }
}
