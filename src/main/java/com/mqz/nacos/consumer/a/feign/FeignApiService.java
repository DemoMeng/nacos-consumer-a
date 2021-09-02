package com.mqz.nacos.consumer.a.feign;

import com.mqz.nacos.feign.api.FeignApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 *  版权所有 © Copyright 2012<br>
 *
 * @Author： 蒙大拿
 * @Date：2021/9/2 2:30 下午
 * @Description
 * @About： https://github.com/DemoMeng
 */
@FeignClient(name = "nacos-provider-a")
public interface FeignApiService extends FeignApi {


}
