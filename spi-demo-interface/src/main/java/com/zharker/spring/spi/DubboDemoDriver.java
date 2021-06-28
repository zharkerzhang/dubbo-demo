package com.zharker.spring.spi;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface DubboDemoDriver {
    String test();
}
