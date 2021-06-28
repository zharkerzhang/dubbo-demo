package com.zharker.spring.cloud.dubbo;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.dubbo.config.annotation.Service;

@Slf4j
@Service(cluster="failfast",loadbalance = "roundrobin")
public class DemoServiceImpl implements IDemoService{
    @Override
    public String getRandomByCount(int count) {
        boolean ranFailed = RandomUtils.nextBoolean();
        if(ranFailed){
            log.error("ranFailed execute");
            throw new RuntimeException("ranFailed execute");
        }
        return RandomStringUtils.randomAlphanumeric(count);
    }
}
