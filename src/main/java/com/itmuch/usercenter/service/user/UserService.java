package com.itmuch.usercenter.service.user;

import com.itmuch.usercenter.dao.UserMapper;
import com.itmuch.usercenter.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Integer id) {
        return userMapper.selectById(id);
    }

}
