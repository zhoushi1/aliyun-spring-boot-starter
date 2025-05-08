# aliyun-oss-spring-boot-starter

#### 组件简介

> 基于 aliyun-sdk-oss 实现的 Spring Boot Starter

#### 使用说明

##### 1、Spring Boot 项目添加 Maven 依赖

``` xml
<dependency>
    <groupId>io.github.zhoushi1</groupId>
    <artifactId>aliyun-oss-spring-boot-starter</artifactId>
    <version>${version}</version>
</dependency>
```

##### 如果使用的是Java 9及以上的版本，则需要添加以下JAXB相关依赖。
```xml
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.3.1</version>
</dependency>
<dependency>
    <groupId>javax.activation</groupId>
    <artifactId>activation</artifactId>
    <version>1.1.1</version>
</dependency>
<!-- no more than 2.3.3-->
<dependency>
    <groupId>org.glassfish.jaxb</groupId>
    <artifactId>jaxb-runtime</artifactId>
    <version>2.3.3</version>
</dependency>
```

##### 2、在`application.yml`添加如下配置

```yaml
# 阿里云配置
aliyun:
  accessKeyId: accessKeyId
  accessKeySecret: accessKeySecret
  # oss配置
  oss:
    enabled: true # true开启、false关闭
    endpoint: oss-cn-xxxxxx.aliyuncs.com # Endpoint
    #其它配置项
```

##### 3、自动注入的类型

- `OSSService`

##### 4、参考 demo
- 待完善