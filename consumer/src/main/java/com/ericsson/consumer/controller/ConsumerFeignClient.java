package com.ericsson.consumer.controller;

import com.ericsson.consumer.client.UserClient;
import com.ericsson.consumer.client.UserClient2;
import com.ericsson.consumer.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class ConsumerFeignClient {

    @Resource
    private UserClient userClient;

    @Resource
    private UserClient2 userClient2;

    @GetMapping("/{id}")
    public User queryUserById(@PathVariable Long id){
        return userClient.queryUserByid(id);
    }

    @GetMapping("/feign/{id}")
    public User queryUserById2(@PathVariable Long id){
        return userClient2.getUserById(id);
    }

}
