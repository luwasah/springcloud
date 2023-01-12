package com.ericsson.consumer.client;

import com.ericsson.consumer.config.FeignConfig;
import com.ericsson.consumer.client.fallback.UserClientFallBack;
import com.ericsson.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//申明当前接口是一个Feign客户端, 指定服务名为user-service
@FeignClient(value="user-service", fallback = UserClientFallBack.class, configuration = FeignConfig.class)
public interface UserClient {

    //最终拼接的请求路径: http://user-service/user/12
    @GetMapping("/user/{id}")
    User queryUserByid(@PathVariable Long id);

}
