package com.ericsson.consumer.client;

import com.ericsson.consumer.client.fallback.DefaultFallback;
import com.ericsson.consumer.config.FeignConfig2;
import com.ericsson.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="user-service", fallback = DefaultFallback.class, configuration = FeignConfig2.class)
public interface UserClient2 {

    //最终拼接的路径：http://user-service/user/3
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id);

}
