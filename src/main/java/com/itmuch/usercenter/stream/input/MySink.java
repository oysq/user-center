package com.itmuch.usercenter.stream.input;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {

    String MY_INPUT = "my_input";

    @Input(MY_INPUT)
    SubscribableChannel output();

}
