package com.ahbin.jul.test;


import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JUL10Test {
    @Test
    public void test01() throws IOException {
        InputStream input = new FileInputStream("logging2.properties");
        //取得日志管理器对象
        LogManager logManager = LogManager.getLogManager();
        //读取自定义的配置文件
        logManager.readConfiguration(input);
        Logger logger = Logger.getLogger("com.generator.test.JUL10Test");

        logger.severe("severe 信息");
        logger.warning("warning 信息");
        logger.info("info 信息");
        logger.config("config 信息");
        logger.fine("fine 信息");
        logger.finer("finer 信息");
        logger.finest("finest 信息");
    }
}
