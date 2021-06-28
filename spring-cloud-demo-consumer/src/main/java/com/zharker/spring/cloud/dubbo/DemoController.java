package com.zharker.spring.cloud.dubbo;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {

    @Reference(mock = "com.zharker.spring.cloud.dubbo.MockDemoServiceImpl")
    private IDemoService demoService;

    @GetMapping("/")
    public String demo(){
        String result = demoService.getRandomByCount(10);
        log.info("result: "+result);
        return result;
    }
}
