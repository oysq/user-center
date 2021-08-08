package com.itmuch.usercenter.stream.listener;

import com.itmuch.usercenter.stream.input.MySink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MySinkListener {

    @StreamListener(MySink.MY_INPUT)
    private void receive(String message) {
        log.info("Binder 收到消息 MySink ==> " + message);
    }

}
