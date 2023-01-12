package com.ericsson.user.controller;

import com.ericsson.user.pojo.User;
import com.ericsson.user.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    @CrossOrigin(origins = "*")
    public User queryUser(@PathVariable Long id){
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return userService.queryUserById(id);
    }

}
