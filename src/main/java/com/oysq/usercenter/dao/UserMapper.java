package com.oysq.usercenter.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oysq.usercenter.domain.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends BaseMapper<User> {
}
