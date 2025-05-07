package com.zhoushi1.aliyun.mns.service;

import com.aliyun.mns.client.MNSClient;

/**
 * 阿里云 OSS Service
 *
 * @author zhoushi1
 */
public interface MNSService {

    /**
     * 构建 MNSClient
     *
     * @return MNSClient
     */
    MNSClient build();

    /**
     * 构建 MNSClient
     *
     * @param accessKeyId     accessKeyId
     * @param accessKeySecret accessKeySecret
     * @param endpoint        endpoint
     * @return MNSClient
     */
    MNSClient build(String accessKeyId, String accessKeySecret, String endpoint);
}
