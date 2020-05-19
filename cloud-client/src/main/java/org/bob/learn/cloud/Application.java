package org.bob.learn.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * cloud-client应用启动类
 */
@Slf4j
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Application {
    public static void main(final String[] args) {
        log.info("cloud-client应用启动开始!");
        SpringApplication.run(Application.class, args);
        log.info("cloud-client应用启动成功!");
    }
}