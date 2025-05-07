package com.zhoushi1.aliyun.mns.properties;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 阿里云MNS属性
 *
 * @author zhoushi1
 */
@Data
@Accessors(chain = true)
@ConfigurationProperties(prefix = AliyunMNSProperties.PREFIX)
public class AliyunMNSProperties {

    public static final String PREFIX = "aliyun.mns";

    /**
     * Endpoint
     */
    private String endpoint;

}
