package com.mqz.nacos.consumer.a.feign;

import com.mqz.nacos.consumer.a.feignError.ProviderServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author mqz
 * @description
 * @abount https://github.com/DemoMeng
 * @since 2021/3/1
 */
@FeignClient(name = "nacos-provider-a",fallback = ProviderServiceImpl.class)
public interface ProviderService {

    @GetMapping(value = "/account/xb/info/{userId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String info(@PathVariable("userId") Long userId);

    @GetMapping(value = "/nacos-provider-a/feign/call?FEIGN_AGENT=nca", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String call();


}
