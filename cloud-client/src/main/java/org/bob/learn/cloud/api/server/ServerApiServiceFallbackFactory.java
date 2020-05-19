package org.bob.learn.cloud.api.server;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.bob.learn.cloud.web.model.Result;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ServerApiServiceFallbackFactory implements FallbackFactory<ServerApiService> {
    @Override
    public ServerApiService create(Throwable throwable) {
        return new ServerApiService() {
            @Override
            public Result test() {
                log.error("调用设备管理系统getActiveDevice接口异常[{}]",throwable.getMessage());
                return Result.invalidParam();
            }
        };
    }
}
