package com.ahbin.jul.test;

import org.junit.Test;

import java.io.IOException;
import java.util.logging.*;

/**
 * @program: study
 * @description: 文件中日志的打印
 * @author: ZhangZB
 * @create: 2021-08-22 15:49
 **/
public class JUL5Test {

    @Test
    public void test01() throws IOException {
        /*
            将日志输出到具体的磁盘文件中
            这样做相当于是做了日志的持久化操作
         */
        //日志记录器
        Logger logger = Logger.getLogger("com.ahbin.jul.test.JUL5Test");
        // 将默认的日志打印防水关闭掉
        // 参数设置为false,我们打印日志的方式就不会按照父logger默认的方式去进行操作
        logger.setUseParentHandlers(false);
        //文件日志处理器
        FileHandler handler = new FileHandler("/Users/ahbin/project/study/log/JUL_STUDY/myLogTest.log");
        //创建日志格式化组件对象
        SimpleFormatter formatter = new SimpleFormatter();
        //在处理器中设置输出格式
        handler.setFormatter(formatter);
        // 在记录器中添加处理器
        logger.addHandler(handler);
        // 设置日志的打印级别
        // 此处必须将日志记录器和处理器的级别进行统一的设置，才会达到日志显示相应级别的效果
//        logger.setLevel(Level.CONFIG);
//        handler.setLevel(Level.CONFIG);
        logger.setLevel(Level.ALL);
        handler.setLevel(Level.ALL);

        logger.severe("severe 信息");
        logger.warning("warning 信息");
        logger.info("info 信息");
        logger.config("config 信息");
        logger.fine("fine 信息");
        logger.finer("finer 信息");
        logger.finest("finest 信息");
    }
}
