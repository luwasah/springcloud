package com.ericsson.consumer.client.fallback;

import com.ericsson.consumer.client.UserClient;
import com.ericsson.consumer.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallBack implements UserClient {
    @Override
    public User queryUserByid(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("用户异常!");
        return user;
    }
}
