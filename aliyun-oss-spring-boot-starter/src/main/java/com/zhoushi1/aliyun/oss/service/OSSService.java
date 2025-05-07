package com.zhoushi1.aliyun.oss.service;

import com.aliyun.oss.OSS;

/**
 * 阿里云 OSS Service
 *
 * @author zhoushi1
 */
public interface OSSService {

    /**
     * 构建OSS
     *
     * @return OSS
     */
    OSS build();
}
