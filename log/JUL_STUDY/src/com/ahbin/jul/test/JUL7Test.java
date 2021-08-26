package com.ahbin.jul.test;

import org.junit.Test;

import java.io.IOException;
import java.util.logging.*;

/**
 * @program: study
 * @description: Logger之间的父子关系
 * @author: ZhangZB
 * @create: 2021-08-22 15:49
 **/
public class JUL7Test {

    @Test
    public void test01() throws IOException {
        /*
            Logger之间的父子关系
                JUL中Logger之间是存在你"父子"关系的
                值得注意的是，这种父子关系不是我们普遍认为的类之间的继承关系
                关系是通过树状结构存储的

                JUL在初始化时会创建一个顶层RootLogger作为所有Logger的父Logger
                查看源码：
                    owner.rootLogger = owner.new RootLogger();
                    RootLogger是LogManage的内部类
                    java.util.logging.LogManager$RootLogger
                    默认的名称为 空串
                    以上的RootLogger对象作为树状结构的根节点存在的
                    将来自定义的父子关系通过路径来进行关联
                    父子关系，同时也是节点之间的挂载关系
                    owner.addLogger(owner.rootLogger);
                    LoggerContext cx = getUserContext(); //LoggerContext一种用来保存节点的map关系
                    rivate LogNode               node; //节点
         */
        /*
            从下面创建的几个logger对象看来你
            我们可以认为logger1是logger2的父亲
         */
        //日志记录器
        Logger logger = Logger.getLogger("com.ahbin.jul");
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
