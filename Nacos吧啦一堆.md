# Nacos简介

- 是啥：
    *注册中心+配置中心的结合 ： Nacos=Eureka+Config+Bus
- Nacos支持AP或者CP两种模式，并且还能进行切换
  * 注意：是能切换，而不是支持CAP这种模式。是支持AP或者CP。
  * CAP理论：（一个分布式系统不可能同时满足C和A，只能在CP或者AP，也就是需要在C和A中寻求平衡）
        C: Consistency ： 一致性：A读取k1库，插入新数据到K1库，随后K1库同步数据到K2库假设失败了，B读取K2库数据，导致和A读取的数据不一致。
        A: Available ： 可以用：部分系统宕机，其他系统还能使用。如：双十一淘宝注册账号不能用，仍能购物下单等。
        P: Partition Tolerance： 分区容错，分布式系统下的两个节点无法通信，导致数据不通什么的，就是称为分区了。
  * BASE理论： 
        BA：Basic Available:基本可用
        S: Soft Status： 中间状态 
        E: Eventually Consistency：最终一致性
        
        
# nameSpace 和 Group 和 DataId 之间的区别是什么？
- 类似Java里面的package名和类名
  * 最外层的namespace是可以用于区分部署环境的，Group和DataID逻辑上区分两个目标对象。
  * 默认情况
  * Namespace=public,Group=DEFAULT_GROUP,默认Cluster是DEFAULT
  * 比如现在有多个开发环境，我们就可以创建多个Namespace，不同的Namespace之间是隔离的。
  
        
  
