package com.oysq.usercenter.stream.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.ErrorMessage;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SpringCloudStreamListener {

    @StreamListener(value = Sink.INPUT, condition = "headers['my-header']=='test-123'")
    private void receive(String message) {
        log.info("Binder 收到消息 ==> " + message);
//        throw new IllegalArgumentException("异常测试");
    }

    @StreamListener("errorChannel")
    public void error(Message<?> message) {
        ErrorMessage errorMessage = (ErrorMessage) message;
        log.info("收到异常 ==> " + errorMessage);
    }

}
