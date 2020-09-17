package com.dubbo.provider.web.service;

import com.dubbo.provider.api.service.ProviderApi;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDateTime;

/**
 * @author mqz
 * @description
 * @since 2020/9/17
 */
@DubboService(version = "${rpc.version}")
public class ProviderApiImpl implements ProviderApi {
    /*@Override
    public String deal() {
        return "dubbo-provider开始提供服务啦，当前时间（"+ LocalDateTime.now() +"）";
    }*/

    @Override
    public String dealWith() {
        return "dubbo-provider开始提供服务啦，当前时间（"+ LocalDateTime.now() +"）";
    }
}
