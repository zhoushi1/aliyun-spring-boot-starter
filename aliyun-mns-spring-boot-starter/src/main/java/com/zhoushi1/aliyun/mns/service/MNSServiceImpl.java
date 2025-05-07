package com.zhoushi1.aliyun.mns.service;

import com.aliyun.mns.client.CloudAccount;
import com.aliyun.mns.client.MNSClient;
import org.apache.commons.lang3.StringUtils;

/**
 * 阿里云 OSS ServiceImpl
 *
 * @author zhoushi1
 */
public class MNSServiceImpl implements MNSService {

    private final CloudAccount cloudAccount;

    public MNSServiceImpl(CloudAccount cloudAccount) {
        this.cloudAccount = cloudAccount;
    }

    /**
     * 构建 MNSClient
     *
     * @return MNSClient
     */
    @Override
    public MNSClient build() {
        return cloudAccount.getMNSClient();
    }

    /**
     * 构建 MNSClient
     *
     * @param accessKeyId     accessKeyId
     * @param accessKeySecret accessKeySecret
     * @param endpoint        endpoint
     * @return MNSClient
     */
    @Override
    public MNSClient build(String accessKeyId, String accessKeySecret, String endpoint) {
        CloudAccount cloudAccount = initCloudAccount(accessKeyId, accessKeySecret, endpoint);
        return cloudAccount.getMNSClient();
    }

    /**
     * 初始化 CloudAccount
     *
     * @return CloudAccount
     */
    private CloudAccount initCloudAccount(String accessKeyId, String accessKeySecret, String endpoint) {
        return new CloudAccount(
                StringUtils.trimToNull(accessKeyId),
                StringUtils.trimToNull(accessKeySecret),
                StringUtils.trimToNull(endpoint)
        );
    }
}
