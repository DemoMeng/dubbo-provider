package com.dubbo.provider.web;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author mqz
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.dubbo.provider"})
@EnableDubbo(scanBasePackages = "com.dubbo.provider.web.service")
public class DubboProviderWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderWebApplication.class, args);
    }

}
