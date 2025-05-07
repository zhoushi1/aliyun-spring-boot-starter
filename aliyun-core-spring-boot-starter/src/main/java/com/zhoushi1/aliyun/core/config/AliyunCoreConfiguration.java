package com.zhoushi1.aliyun.core.config;

import com.zhoushi1.aliyun.core.properties.AliyunCoreProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 阿里云核心配置
 *
 * @author zhoushi1
 */
@Configuration
@EnableConfigurationProperties(AliyunCoreProperties.class)
public class AliyunCoreConfiguration {
}
