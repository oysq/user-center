package com.itmuch.usercenter.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itmuch.usercenter.domain.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends BaseMapper<User> {
}
