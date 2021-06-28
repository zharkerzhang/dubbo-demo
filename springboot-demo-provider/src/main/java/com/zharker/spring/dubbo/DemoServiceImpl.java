package com.zharker.spring.dubbo;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements IDemoService{
    @Override
    public String getRandomByCount(int count) {
        return RandomStringUtils.randomAlphanumeric(count);
    }
}
