package com.mqz.nacos.consumer.a.web;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mqz
 * @description
 * @abount https://github.com/DemoMeng
 * @since 2021/2/24
 */
@RestController
@RequestMapping("/a")
public class ANacosWebController {

    private final static Logger log = LoggerFactory.getLogger(ANacosWebController.class);


    //@NacosValue(value = "${name:默认name}", autoRefreshed = true)
    @Value(value = "${name:ccc}")
    private String configName;
    //@NacosValue(value = "${url:默认url}", autoRefreshed = true)
    @Value(value = "${url:xxx}")
    private String configUrl;

    @GetMapping("/index/{name}")
    public String index(@PathVariable(name = "name") String name){
        log.info("Nacos客户端A收到请求");
        log.info("配置中心："+configName);
        log.info("配置中心："+configUrl);
        return String.format("Nacos客户端A:你好，%s。配置中心：%s,%s",name,configName,configUrl);
    }


}
