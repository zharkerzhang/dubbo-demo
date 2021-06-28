package com.zharker.spring.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderMain {

    public static void main(String[] args) throws IOException {
        String configPath = "META-INF/spring/demo-provider.xml";
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(configPath);
        cxt.start();
        System.in.read();
    }
}
