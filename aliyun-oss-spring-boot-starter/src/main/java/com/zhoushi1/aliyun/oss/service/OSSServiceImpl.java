package com.zhoushi1.aliyun.oss.service;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.auth.DefaultCredentialProvider;
import org.apache.commons.lang3.StringUtils;

/**
 * 阿里云 OSS ServiceImpl
 *
 * @author zhoushi1
 */
public class OSSServiceImpl implements OSSService {
    private final String endpoint;
    private final DefaultCredentialProvider defaultCredentialProvider;

    public OSSServiceImpl(String endpoint, DefaultCredentialProvider defaultCredentialProvider) {
        this.endpoint = endpoint;
        this.defaultCredentialProvider = defaultCredentialProvider;
    }

    /**
     * 构建OSS
     *
     * @return OSS
     */
    @Override
    public OSS build() {
        return new OSSClientBuilder().build(
                StringUtils.trimToNull(endpoint),
                defaultCredentialProvider
        );
    }
}
