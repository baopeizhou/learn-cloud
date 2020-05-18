package org.bob.learn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * learn-cloud应用启动类
 */
@Slf4j
@EnableFeignClients
@SpringBootApplication
public class Application {
    public static void main(final String[] args) {
        log.info("learn-cloud应用启动开始!");
        SpringApplication.run(Application.class, args);
        log.info("learn-cloud应用启动成功!");
    }
}