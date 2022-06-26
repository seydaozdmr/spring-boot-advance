package com.springboot.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class MessageEventListener implements ApplicationListener<MessageEvent> {


    @Override
    public void onApplicationEvent(MessageEvent event) {
        MessageEvent msgEvent=(MessageEvent) event;
        System.out.println("Received : "+msgEvent.getMessage());

    }
}
