package com.ahbin.slf4j.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JTest03 {

    @Test
    public void test01(){
        /*
            日志对于异常信息的处理
                一般情况下，我们在开发中的异常信息，都是记录在控制台上（我们开发环境一种日志打印方式）
                我们会根据异常信息，提取出有用的线索，来调试bug
                但是在真实生产环境中（项目上线），对于服务器或者是系统相关的问题，
                在控制台上其实也会提供相应的异常或者错误信息的输出
                但是这种错误输出方式（输出的时间，位置，格式。。。）都是服务器系统默认的

                我们可以通过日志技术，选择将异常以日志打印的方式，进行输出查看
                输出的时间，位置（控制台，文件），格式，完全由我们自己去进行定义
         */
//        System.out.println(123);
        Logger logger = LoggerFactory.getLogger(SLF4JTest03.class);
        try {
            Class.forName("aaa");
        } catch (ClassNotFoundException e) {
            // 打印栈追踪信息
//            e.printStackTrace();
            logger.info("xxx类中的xxx方法出现了异常，请及时关注信息");
            // e是引用类型对象，不能根前面的{}做有效的字符串拼接
            //logger.info("具体错误是：{}", e);
            //我们不用加{}，直接后面加上异常对象即可
            logger.info("具体错误是：", e);
        }
    }

}
