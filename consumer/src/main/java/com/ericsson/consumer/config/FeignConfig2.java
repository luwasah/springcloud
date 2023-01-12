package com.ericsson.consumer.config;

import com.alibaba.fastjson.JSON;
import feign.Logger;
import feign.Request;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.Map;

@Slf4j
@Configuration
public class FeignConfig2 implements RequestInterceptor {

    @Bean
    Logger.Level getLogLevel(){
        log.info("set log level success...");
        return Logger.Level.FULL;
    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        Request request = requestTemplate.request();
        Map<String, Collection<String>> headers = request.headers();
        Collection<String> strings = headers.get("test");
        System.out.println(JSON.toJSON(strings));
        requestTemplate.header("----------------test11", strings);
    }

}
