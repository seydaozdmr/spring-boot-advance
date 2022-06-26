package com.springboot.properties;

import org.springframework.stereotype.Service;

@Service
public class MessageRenderer {
    private MessageProvider messageProvider;

    public MessageRenderer(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public void render(){
        System.out.println(messageProvider.getMessage());
    }


}
