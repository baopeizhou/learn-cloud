package org.bob.learn.cloud.api.server;

import org.bob.learn.cloud.web.model.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cloud-server",fallbackFactory = ServerApiServiceFallbackFactory.class)
public interface ServerApiService {
    @GetMapping("/server/test")
    Result test();
}
