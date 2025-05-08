## 基于 `阿里云 Java SDK` 封装的 `Spring Boot Starter`

[![码云Gitee](https://gitee.com/zhoushi1/aliyun-spring-boot-starter/badge/star.svg?theme=blue)](https://gitee.com/zhoushi1/aliyun-spring-boot-starter)
[![Github](https://img.shields.io/github/stars/zhoushi1/aliyun-spring-boot-starter?logo=github&style=flat)](https://github.com/zhoushi1/aliyun-spring-boot-starter)
[![GitHub release](https://img.shields.io/github/release/zhoushi1/aliyun-spring-boot-starter.svg)](https://github.com/zhoushi1/aliyun-spring-boot-starter/releases)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.zhoushi1/aliyun-spring-boot-starter.svg)](http://mvnrepository.com/artifact/io.github.zhoushi1/aliyun-spring-boot-starter)
[![使用IntelliJ IDEA开发维护](https://img.shields.io/badge/IntelliJ%20IDEA-支持-blue.svg)](https://www.jetbrains.com)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/license/mit)

#### 阿里云`Java`开发，支持包括 OSS、轻量消息队列(原MNS) 等功能。

### Maven 引用方式
注意：最新版本（包括测试版）为 [![Maven Central](https://img.shields.io/maven-central/v/io.github.zhoushi1/aliyun-spring-boot-starter.svg)](http://mvnrepository.com/artifact/io.github.zhoushi1/aliyun-spring-boot-starter)，以下为最新正式版。

```xml
<dependency>
  <groupId>is.github.zhoushi1</groupId>
  <artifactId>（不同模块参考下文）</artifactId>
  <version>1.0.3</version>
</dependency>
```
- 阿里云OSS：`aliyun-oss-spring-boot-starter`
- 阿里云轻量消息队列(原MNS)：`aliyun-mns-spring-boot-starter`

#### 如果使用的是Java 9及以上的版本，则需要添加以下JAXB相关依赖。
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