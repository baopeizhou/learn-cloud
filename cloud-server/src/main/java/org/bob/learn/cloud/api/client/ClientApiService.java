package org.bob.learn.cloud.api.client;

import org.bob.learn.cloud.web.model.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "cloud-client",fallbackFactory = ClientApiServiceFallbackFactory.class)
public interface ClientApiService {

    @GetMapping("/learn/client/test")
    Result test();


}
