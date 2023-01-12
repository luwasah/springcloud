package com.ericsson.consumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLogLevel(){
        //记录所有请求和相应的log明细
        return Logger.Level.FULL;
    }
}
