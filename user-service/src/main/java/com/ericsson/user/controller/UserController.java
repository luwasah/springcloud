package com.ericsson.user.controller;

import com.ericsson.user.pojo.User;
import com.ericsson.user.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

//    @Value("${test.name}")
//    private String name;

    @GetMapping("/{id}")
    @CrossOrigin(origins = "*")
    public User queryUser(HttpServletRequest request, @PathVariable Long id){
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("配置中心配置的配置项name：" + name);

        String header = request.getHeader("test");
        System.out.println("-----------------user-service has received 'test' in request Header: " + header);

        return userService.queryUserById(id);
    }

}
