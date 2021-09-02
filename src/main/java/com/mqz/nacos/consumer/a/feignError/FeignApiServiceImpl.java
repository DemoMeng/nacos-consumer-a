package com.mqz.nacos.consumer.a.feignError;

import com.mqz.nacos.consumer.a.feign.FeignApiService;
import com.mqz.nacos.feign.common.Bean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *  版权所有 © Copyright 2012<br>
 *
 * @Author： 蒙大拿
 * @Date：2021/9/2 5:44 下午
 * @Description 触发hystrix
 * @About： https://github.com/DemoMeng
 */

@Component
@Slf4j
public class FeignApiServiceImpl implements FeignApiService {
    @Override
    public String api1(String para) {
        log.info("【触发hystrix】FeignApiServiceImpl api1");
        return "【触发hystrix】FeignApiServiceImpl api1";
    }

    @Override
    public String api2(Bean bean) {
        log.info("【触发hystrix】FeignApiServiceImpl api1");
        return "【触发hystrix】FeignApiServiceImpl api1";
    }
}
