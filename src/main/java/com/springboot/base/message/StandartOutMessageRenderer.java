package com.springboot.base.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class StandartOutMessageRenderer implements MessageRenderer{
    private MessageProvider provider;


    @Override
    public void render() {
        System.out.println(provider.getMessage());
    }

    @Override
    //@Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.provider=provider;
    }

    @Override
    public MessageProvider getProvider() {
        return this.provider;
    }
}
