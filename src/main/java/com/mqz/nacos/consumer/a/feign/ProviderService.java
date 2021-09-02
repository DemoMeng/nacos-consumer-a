package com.mqz.nacos.consumer.a.feign;

import com.mqz.nacos.consumer.a.common.User;
import com.mqz.nacos.consumer.a.feignError.ProviderServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/nacos-provider-a/feign/call/1")
    String call1(@RequestParam String name);

    @PostMapping("/nacos-provider-a/feign/call/2")
    String call2(@RequestBody User user);

    @PostMapping("/nacos-provider-a/feign/call/3")
    String call3(@RequestHeader String token);






}
