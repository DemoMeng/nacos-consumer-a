package com.mqz.nacos.consumer.a.feignError;

import com.mqz.nacos.consumer.a.common.User;
import com.mqz.nacos.consumer.a.feign.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    @Override
    public String call1(String name) {
        log.warn("call1调用异常，请尽快处理");
        return null;
    }

    @Override
    public String call2(User user) {
        log.warn("call2调用异常，请尽快处理");
        return null;
    }

    @Override
    public String call3(String token) {
        log.warn("call3调用异常，请尽快处理");
        return null;
    }


}
