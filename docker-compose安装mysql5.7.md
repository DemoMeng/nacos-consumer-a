# docker-compose安装mysql5.7
    
 - docker run的方式启动mysql：注意需要配置三个挂载目录：数据，日志，配置否则会出现报错。 
    * docker run -p 3306:3306 --name mysql5.7ByRun  --privileged=true -v /data/log:/var/log/mysql -v /data/data:/var/lib/mysql -v /data/conf:/etc/mysql -e MYSQL_ROOT_PASSWORD=mengqizhang -d mysql:5.7
 - docker compose方式启动mysql：请参考 nacos-docker-server/docker-compose-mysql57.yml的配置文件
    * docker-compose -f nacos-docker-server/docker-compose-mysql57.yml up -d
    



