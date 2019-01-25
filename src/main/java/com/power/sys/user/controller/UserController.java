package com.power.sys.user.controller;

import com.power.sys.user.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Administrator
 * @Date 2019/1/25 0025 下午 17:09
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping
    public String queryUserInfo(){
        User user = new User();
        user.setId(1);
        user.setUsername("power");
        user.setPassword("123456");

        return user.toString();
    }
}
