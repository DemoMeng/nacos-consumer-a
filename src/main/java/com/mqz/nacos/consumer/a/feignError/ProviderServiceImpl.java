package com.mqz.nacos.consumer.a.feignError;

import com.mqz.nacos.consumer.a.feign.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: mqz
 * @Date: 2021/3/23
 * @Description:
 * @About: https://github.com/DemoMeng
 */
@Component
public class ProviderServiceImpl implements ProviderService {

    private final static Logger log = LoggerFactory.getLogger(ProviderServiceImpl.class);

    @Override
    public String info(Long userId) {
        Date date=new Date();
        log.warn(date.toString()+"sendingOrder出现异常！请管理员尽快处理");
        return null;
    }

    @Override
    public String call() {
        Date date=new Date();
        log.warn(date.toString()+"sendingOrder出现异常！请管理员尽快处理");
        return null;
    }
}
