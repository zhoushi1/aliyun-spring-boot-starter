package com.zhoushi1.aliyun.oss.properties;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.zhoushi1.aliyun.oss.properties.AliyunOSSProperties.PREFIX;

/**
 * 阿里云OSS属性
 *
 * @author zhoushi1
 */
@Data
@Accessors(chain = true)
@ConfigurationProperties(prefix = PREFIX)
public class AliyunOSSProperties {
    public static final String PREFIX = "aliyun.oss";

    /**
     *
     */
    private String endpoint;
}
