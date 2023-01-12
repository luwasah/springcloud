package com.ericsson.consumer.config;

import com.alibaba.fastjson.JSON;
import feign.Logger;
import feign.Request;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.Map;

@Configuration
public class FeignConfig{
    @Bean
    Logger.Level feignLogLevel(){
        //记录所有请求和相应的log明细
        return Logger.Level.FULL;
    }

}
