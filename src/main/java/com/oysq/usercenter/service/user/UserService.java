package com.oysq.usercenter.service.user;

import com.oysq.usercenter.dao.UserMapper;
import com.oysq.usercenter.domain.entity.User;
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
