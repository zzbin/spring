package com.ahbin.jul.test;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @program: study
 * @description: 日志级别
 * @author: ZhangZB
 * @create: 2021-08-22 15:49
 **/
public class JUL3Test {

    @Test
    public void test01(){

        /**
         * 日志的级别（通过源码查看，非常简单）
         * SEVERE:(最高级)错误  ---最高级的日志级别
         * WARNING:警告
         * INFO:（默认的级别）消息
         * CONFIG: 配置
         * FINE：详细信息（少）
         * FINER：详细信息（中）
         * FINEST：详细信息（多） ---最低级的日志级别
         *两个特殊的级别
         * OFF 可用来关闭日志记录
         * ALL 启用所有消息的日志记录
         *
         * 对于日志的级别，我们重点关注的是new对象的时候的第二个参数
         * 是一个数值
         *
         * OFF Integer.MAX_VALUE 整型最大值
         * SERVER 1000
         * WARNING 900
         * ...
         * ...
         * FINEST 300
         * 这个数值的意义在于，如果我们设置的日志级别是INFO --800
         * 那么最终展现的日志信息，必须是数值大于800的所有的日志信息，最终展现的就是：
         * SERVER
         * WARNING
         * INFO
         *
         * 通过打印结果，我们看到了仅仅只是输出了info级别以及比info级别高的日志爱信息
         * 比info级别低的日志信息没有输出出来
         * 证明了info级别的日志信息，它是系统默认的日志级别
         * 在默认日志级别info的基础上，打印比它级别高的信息
         */
        Logger logger = Logger.getLogger("com.ahbin.jul.test.JUL3Test");
        /**
         * 如果仅仅只是通过以下形式来设置日志级别
         * 那么不能够起到效果
         * 将来需要搭配处理器handle共同设置才会生效
         */
        logger.setLevel(Level.CONFIG);

        logger.severe("severe 信息");
        logger.warning("warning 信息");
        logger.info("info 信息");
        logger.config("config 信息");
        logger.fine("fine 信息");
        logger.finer("finer 信息");
        logger.finest("finest 信息");
    }
}
