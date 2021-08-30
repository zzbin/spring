package com.ahbin.slf4j.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JTest05 {

    /*
        使用slf4j-nop
            表示不记录日志
            在我们使用sfl4j-nop的时候
            首先还是需要导入实现依赖
            这个实现依赖，根据我们之前所总结出来的日志实现种类的第二种
            与logback和simple是属于一类的
            通过集成依赖的顺序而定
            所以如果想要让nop发挥效果，禁止所有日志的打印
            那么久必须要将slf4j-nop的依赖放在所有日志实现依赖的上方
     */
    @Test
    public void test01(){
        Logger logger = LoggerFactory.getLogger(SLF4JTest05.class);
        try {
            Class.forName("aaa");
        } catch (ClassNotFoundException e) {
            // 打印栈追踪信息
            logger.info("xxx类中的xxx方法出现了异常，请及时关注信息");
            // e是引用类型对象，不能根前面的{}做有效的字符串拼接
            //logger.info("具体错误是：{}", e);
            //我们不用加{}，直接后面加上异常对象即可
            logger.info("具体错误是：", e);
        }
    }

}
