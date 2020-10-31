package com.consumer;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName ConsumerTest
 * @Discription 消费者测试类
 * @Author 子辰
 * @Date 2020/10/31 22:39
 */
public class ConsumerTest {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerTest.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:springmvc.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");

        logger.debug("Dubbo consumer start ...");
        logger.info(demoService.hello("哈哈哈"));
        try {
            System.in.read();
        } catch (IOException e) {
            logger.error("Dubbo consumer end ... ", e);
        }
    }
}
