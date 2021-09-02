package com.mqz.nacos.consumer.a.web;

import com.mqz.nacos.consumer.a.common.User;
import com.mqz.nacos.consumer.a.common.WebRequestMapping;
import com.mqz.nacos.consumer.a.feign.ProviderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author mqz
 * @description
 * @abount https://github.com/DemoMeng
 * @since 2021/2/24
 */
@RestController
@RequestMapping(WebRequestMapping.PREFIX+"/a")
@Api(tags = "feign调用测试入口",value = "feign调用测试入口")
public class FeignClientController {

    @Resource
    private ProviderService providerService;

    @GetMapping("/provider/getx")
    @ApiOperation(value = "调用provider")
    public String callProviderx() {
        return providerService.call();
    }

    @GetMapping("/provider/get1")
    @ApiOperation(value = "调用provider-测试@RequestParam")
    public String callProvider1(@RequestParam String userName) {
        return providerService.call1(userName);
    }

    @PostMapping("/provider/get2")
    @ApiOperation(value = "调用provider-测试实体")
    public String callProvider2(@RequestBody User user) {
        return providerService.call2(user);
    }

    @GetMapping("/provider/get3")
    @ApiOperation(value = "调用provider-测试@RequestHeader")
    public String callProvider3(@RequestHeader String token) {
        return providerService.call3(token);
    }



}