package com.zhoushi1.aliyun.oss.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.common.auth.DefaultCredentialProvider;
import com.zhoushi1.aliyun.core.properties.AliyunCoreProperties;
import com.zhoushi1.aliyun.oss.properties.AliyunOSSProperties;
import com.zhoushi1.aliyun.oss.service.OSSService;
import com.zhoushi1.aliyun.oss.service.OSSServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 阿里云OSS自动配置
 *
 * @author zhoushi1
 */
@Configuration
@EnableConfigurationProperties(AliyunOSSProperties.class)
@ConditionalOnClass(OSS.class)
@ConditionalOnProperty(prefix = AliyunOSSProperties.PREFIX, name = "enabled")
public class AliyunOSSAutoConfiguration {

    private final AliyunCoreProperties coreProperties;

    private final AliyunOSSProperties ossProperties;

    public AliyunOSSAutoConfiguration(AliyunCoreProperties coreProperties, AliyunOSSProperties ossProperties) {
        this.coreProperties = coreProperties;
        this.ossProperties = ossProperties;
    }

    @Bean
    @ConditionalOnMissingBean(OSSService.class)
    public OSSService ossService() {
        DefaultCredentialProvider defaultCredentialProvider = new DefaultCredentialProvider(
                StringUtils.trimToNull(coreProperties.getAccessKeyId()),
                StringUtils.trimToNull(coreProperties.getAccessKeySecret())
        );
        return new OSSServiceImpl(ossProperties.getEndpoint(), defaultCredentialProvider);
    }
}
