package com.ericsson.consumer.controller;

import com.ericsson.consumer.pojo.User;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumer")
@Slf4j
@DefaultProperties(defaultFallback = "defaultFallback")
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/{id}")
//    @HystrixCommand(fallbackMethod = "queryUserByIdFallBack")
    @HystrixCommand
    public String queryUserById(@PathVariable Long id){
        if(id == 1){
            throw new RuntimeException("系统忙!");
        }
//        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
//        ServiceInstance instance = instances.get(0);
//        String url = "http://"+ instance.getHost() +":"+ instance.getPort() +"/user/"+id;

        String url = "http://user-service/user/"+id;
        return restTemplate.getForObject(url, String.class);
    }

    public String queryUserByIdFallBack(Long id){
        log.info("查询用户信息失败! id: {}", id);
        return "对不起,网路太拥挤了!";
    }

    public String defaultFallback(){
        return "默认提示: 对不起,网路太拥挤了!";
    }

}
