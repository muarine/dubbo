## 项目名称：dubbo-demo
## [项目地址](http://www.muarine.com)
## 版本号：0.1.1-SNAPSHOT Spring-4.2.3	Mybatis-3.3.0
## 主要功能：
*dubboserver 服务提供者 集成Mybatis + SpringContext 
*实现主从读库操作，TODO：但还需要抽象封装数据库中间件
*dubboclient 消费者集成Spring-4.2.3 
	
## 目录清单
* **dubboclient** 服务消费者
* **dubboserver** 服务提供者
* **dubbo-admin** dubbo控制后台 已添加
* **dubbo-monitor** 后台监控 已添加

## 要做的事情
* **配置maven setting.xml**

```xml

<mirror>
	<id>central-repos2</id>
	<name>Central repository 2</name>
	<url>http://repo1.maven.org/maven2/</url>
	<mirrorOf>central</mirrorOf>
</mirror>
<mirror>
    <id>oschina-repos</id>
    <name>Oschina Releases</name>
    <url>http://maven.oschina.net/content/groups/public</url>
	<mirrorOf>central</mirrorOf>j
</mirror>
<mirror>
	<id>central-repos</id>
	<name>Central repository</name>
	<url>http://repo.maven.apache.org/maven2</url>
	<mirrorOf>central</mirrorOf>
</mirror>
<mirror>
    <id>java-repos</id>
    <name>Java mirror</name>
    <url>http://download.java.net/maven/2/</url>
	<mirrorOf>central</mirrorOf>
</mirror>

```
* **配置dubbo-admin**

```properties

// 填写zookeeper注册地址，也可用mulitcast / dubbo 协议注册
dubbo.registry.address=zookeeper://127.0.0.1:2181
dubbo.admin.root.password=root
dubbo.admin.guest.password=guest

```

* **配置dubbo-monitor**

```properties

dubbo.container=log4j,spring,registry,jetty
dubbo.application.name=simple-monitor
dubbo.application.owner=muarine

#dubbo.registry.address=multicast://224.5.6.7:1234
dubbo.registry.address=zookeeper://127.0.0.1:2181
#dubbo.registry.address=redis://127.0.0.1:6379
#dubbo.registry.address=dubbo://127.0.0.1:9090
dubbo.protocol.port=7070

dubbo.jetty.port=8080
dubbo.jetty.directory=${user.home}/monitor
dubbo.charts.directory=${dubbo.jetty.directory}/charts
dubbo.statistics.directory=${user.home}/monitor/statistics

dubbo.log4j.file=logs/dubbo-monitor-simple.log
dubbo.log4j.level=WARN

```


