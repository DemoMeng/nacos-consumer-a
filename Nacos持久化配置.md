# Nacos持久化配置-mysql

1.mysql创建 nacos_config 数据库，
2.并且执行以下的sql脚本 ：https://github.com/alibaba/nacos/blob/master/config/src/main/resources/META-INF/nacos-db.sql
3.配置nacos-hostname.env mysql相关的配置参数，请参考 nacos-docker-server/nacos-hostname.env
4.并且把该外部配置nacos-hostname.env加入到nacos-docker启动中，请参考 nacos-docker-server/nacos-compose-start.yml



MySQL 5.7 (官方镜像不支持mysql8)
![nacos-mysql持久化报错](images/nacos-mysql持久化问题-1.jpg)


![nacos-mysql持久化报错](images/nacos-mysql持久化报错-1.jpg)
![nacos-mysql持久化报错](images/nacos-mysql持久化报错-2.jpg)




