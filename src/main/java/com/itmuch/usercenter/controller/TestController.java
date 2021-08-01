package com.itmuch.usercenter.controller;

import com.itmuch.usercenter.dao.UserMapper;
import com.itmuch.usercenter.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/test")
    public User test() {
        User user = User.builder()
                .wxId("wx123456789")
                .wxNickname("小欧")
                .roles("admin")
                .avatarUrl("www.abc.com")
                .createTime(new Date())
                .updateTime(new Date())
                .bonus(100)
                .build();
        userMapper.insert(user);
        return user;
    }

}
