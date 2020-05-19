package org.bob.learn.cloud.api.client;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.bob.learn.cloud.web.model.Result;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ClientApiServiceFallbackFactory implements FallbackFactory<ClientApiService> {
    @Override
    public ClientApiService create(Throwable throwable) {
        return new ClientApiService() {
            @Override
            public Result test() {
                log.error("调用设备管理系统getActiveDevice接口异常[{}]",throwable.getMessage());
                return Result.invalidParam();
            }
        };
    }
}
