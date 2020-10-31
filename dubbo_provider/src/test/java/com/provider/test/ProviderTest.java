package com.provider.test;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName ProviderTest
 * @Discription 提供者测试类
 * @Author 子辰
 * @Date 2020/10/31 22:26
 */
public class ProviderTest {
    public static final Logger logger = LoggerFactory.getLogger(ProviderTest.class);
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();
        logger.info("Dubbo provider start ...");

        try {
            System.in.read();//按任意键退出
        } catch (IOException e) {
            logger.error("Dubbo provider end...", e);
        }
    }
}
