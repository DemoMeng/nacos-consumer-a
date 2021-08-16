package com.mqz.nacos.consumer.a;

//import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author mqz
 * @since nacos客户端A
 * @description
 * @abount https://github.com/DemoMeng
 *
 *   NacosPropertySource:读取Nacos配置中心的配置，Nacos配置是手动添加的也能导入外部文件。
 */

//@NacosPropertySource(dataId = "mqz-data-id", autoRefreshed = true)  //使用 @NacosPropertySource 加载 dataId 为 example 的配置源，并开启自动更新：
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class})
@EnableDiscoveryClient
@ComponentScan(value = {"com.mqz"})//需要扫描到底层包mars项目
@Configuration
@EnableFeignClients(basePackages = {"com.mqz.nacos.consumer.a.**"})
public class NacosConsumerAApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerAApplication.class, args);
    }

}
