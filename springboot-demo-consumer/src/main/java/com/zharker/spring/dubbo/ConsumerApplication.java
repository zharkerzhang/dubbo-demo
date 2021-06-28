package com.zharker.spring.dubbo;


import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }

    @Reference(url = "dubbo://192.168.1.9:20880/com.zharker.spring.dubbo.IDemoService")
    private IDemoService demoService;

    @Bean
    public ApplicationRunner runner(){
        return args -> {
            String result = demoService.getRandomByCount(10);
            System.out.println("result: "+result);
        };
    }
}
