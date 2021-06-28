package com.zharker.spring.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerMain {

    public static void main(String[] args) {
        String configPath = "classpath*:META-INF/spring/demo-consumer.xml";
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(configPath);

        IDemoService demoService = (IDemoService) cxt.getBean("demoService");
        String result = demoService.getRandomByCount(10);
        System.out.println("random str: "+result);
    }
}
