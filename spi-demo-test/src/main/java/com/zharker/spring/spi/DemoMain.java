package com.zharker.spring.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.ServiceLoader;

public class DemoMain {
    public static void main(String[] args) {
        ServiceLoader<DemoDriver> serviceLoader = ServiceLoader.load(DemoDriver.class);
        serviceLoader.stream()
                .map(ServiceLoader.Provider::get)
                .map(DemoDriver::test).forEach(System.out::println);

        ExtensionLoader<DubboDemoDriver> extensionLoader = ExtensionLoader.getExtensionLoader(DubboDemoDriver.class);
        DubboDemoDriver dubboDemoDriver = extensionLoader.getExtension("dubboDemoDriver");
        System.out.println(dubboDemoDriver.test());
    }
}
