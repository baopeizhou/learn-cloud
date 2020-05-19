package org.bob.learn.cloud.web.controller;

import org.bob.learn.cloud.api.client.ClientApiService;
import org.bob.learn.cloud.web.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private ClientApiService clientApiService;

    @GetMapping("/test")
    public Result test(){
        return Result.success(null);
    }

    @GetMapping("/get")
    public Result get(){
        return clientApiService.test();
    }
}
