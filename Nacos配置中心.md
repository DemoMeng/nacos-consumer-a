# 配置中心配置
- ![nacos配置中心](images/nacos-配置中心1.jpg)
- ![nacos配置中心](images/nacos-配置中心2.jpg)
- ![nacos配置中心](images/nacos-配置中心3.jpg)

- 注意依赖是引用 spring-cloud-starter-alibaba-nacos-config

- Nacos配置文件的命名规则：
 * #${prefix}-${spring.profile.active}.${file-extension}
 * # ${spring.application.name}-${spring.profile.active}.${file-extension}
 
 
- 这里Controller使用了@RefreshScope注解 保证Nacos能实现动态刷新功能。




