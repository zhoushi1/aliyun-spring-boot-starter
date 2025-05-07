package com.zhoushi1.aliyun.mns.config;

import com.aliyun.mns.client.CloudAccount;
import com.zhoushi1.aliyun.core.properties.AliyunCoreProperties;
import com.zhoushi1.aliyun.mns.properties.AliyunMNSProperties;
import com.zhoushi1.aliyun.mns.service.MNSService;
import com.zhoushi1.aliyun.mns.service.MNSServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 阿里云MNS自动配置
 *
 * @author zhoushi1
 */
@Configuration
@EnableConfigurationProperties(AliyunMNSProperties.class)
@ConditionalOnClass(MNSService.class)
@ConditionalOnProperty(prefix = AliyunMNSProperties.PREFIX, value = "enabled", matchIfMissing = true)
public class AliyunMNSAutoConfiguration {

    private final AliyunCoreProperties coreProperties;

    private final AliyunMNSProperties mnsProperties;

    public AliyunMNSAutoConfiguration(AliyunCoreProperties coreProperties, AliyunMNSProperties mnsProperties) {
        this.coreProperties = coreProperties;
        this.mnsProperties = mnsProperties;
    }

    @Bean
    @ConditionalOnMissingBean(MNSService.class)
    public MNSService mnsService() {
        CloudAccount cloudAccount = new CloudAccount(
                StringUtils.trimToNull(coreProperties.getAccessKeyId()),
                StringUtils.trimToNull(coreProperties.getAccessKeySecret()),
                StringUtils.trimToNull(mnsProperties.getEndpoint())
        );
        return new MNSServiceImpl(cloudAccount);
    }

    // @Bean
    // @ConditionalOnMissingBean(MNSService.class)
    // public MNSService mnsService() {
    //     return new MNSServiceImpl(coreProperties, mnsProperties);
    // }
}
