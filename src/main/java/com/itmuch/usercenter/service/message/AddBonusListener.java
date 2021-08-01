package com.itmuch.usercenter.service.message;

import com.itmuch.usercenter.dao.UserMapper;
import com.itmuch.usercenter.domain.dto.message.UserAddBonusMessage;
import com.itmuch.usercenter.domain.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RocketMQMessageListener(
        consumerGroup = "consumer-user-add-bonus",
        topic = "add-bonus"
)
public class AddBonusListener implements RocketMQListener<UserAddBonusMessage> {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void onMessage(UserAddBonusMessage userAddBonusMessage) {
        log.info("rocketMQ 收到消息 --> "+userAddBonusMessage.toString());

        User user = userMapper.selectById(userAddBonusMessage.getUserId());
        if(user != null) {
            user.setBonus(user.getBonus() + userAddBonusMessage.getBonus());
            userMapper.updateById(user);
        }
    }
}
