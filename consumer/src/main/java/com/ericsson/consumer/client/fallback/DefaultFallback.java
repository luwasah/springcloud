package com.ericsson.consumer.client.fallback;

import com.ericsson.consumer.client.UserClient2;
import com.ericsson.consumer.pojo.User;
import org.springframework.stereotype.Component;

/**
 * 服务降级处理，请求user-service时进入此方法
 */
@Component
public class DefaultFallback implements UserClient2 {

    @Override
    public User getUserById(Long id) {
        User user = new User();
        user.setNote("查询用户失败，用户ID：" + id);
        return user;
    }
}
