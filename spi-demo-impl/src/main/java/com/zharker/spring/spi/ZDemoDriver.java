package com.zharker.spring.spi;

public class ZDemoDriver implements DemoDriver{
    @Override
    public String test() {
        return "ZDemoDriver";
    }
}
