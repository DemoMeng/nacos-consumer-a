package com.mqz.nacos.consumer.a.web;

import com.mqz.nacos.consumer.a.common.WebRequestMapping;
import com.mqz.nacos.consumer.a.feign.FeignApiService;
import com.mqz.nacos.feign.common.Bean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 *  版权所有 © Copyright 2012<br>
 *
 * @Author： 蒙大拿
 * @Date：2021/9/2 2:32 下午
 * @Description
 * @About： https://github.com/DemoMeng
 */
@RestController
@RequestMapping(WebRequestMapping.PREFIX+"/a/consumer")
@Api(tags = "消费方-feign调用测试入口")
@Slf4j
public class FeignApiController {


    @Resource
    private FeignApiService feignApiService;


    @GetMapping("/feign/api/1")
    @ApiOperation(value = "消费方调用1")
    public String api1(@RequestParam String para){
        String result = feignApiService.api1(para);
        log.info("【消费方】返回：{}",result);
        return "消费方：OK";
    }


    @PostMapping("/feign/api/2")
    @ApiOperation(value = "消费方调用2")
    public String api2(@RequestBody Bean bean){
        String result = feignApiService.api2(bean);
        log.info("【消费方】返回：{}",result);
        return "消费方：OK";
    }





}
