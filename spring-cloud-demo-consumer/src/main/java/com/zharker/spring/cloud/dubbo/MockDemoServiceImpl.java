package com.zharker.spring.cloud.dubbo;

public class MockDemoServiceImpl implements IDemoService{
    @Override
    public String getRandomByCount(int count) {
        return "back-end error";
    }
}
