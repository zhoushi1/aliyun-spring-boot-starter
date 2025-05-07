package com.zhoushi1.aliyun.core.properties;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 阿里云核心属性
 *
 * @author zhoushi1
 */
@Data
@Accessors(chain = true)
@ConfigurationProperties(prefix = AliyunCoreProperties.PREFIX)
public class AliyunCoreProperties {

    public static final String PREFIX = "aliyun";

    /**
     * AccessKey ID
     */
    private String accessKeyId;

    /**
     * AccessKey Secret
     */
    private String accessKeySecret;
}
