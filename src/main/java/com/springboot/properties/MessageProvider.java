package com.springboot.properties;

import com.springboot.events.MessageEvent;
import org.springframework.stereotype.Component;

@Component
public class MessageProvider {
    private String message;

    public MessageProvider(){}

    public MessageProvider(String message) {
        this.message = message;
    }

    public void setMessage(String message){
        this.message=message;
    }

    public String getMessage(){
        return this.message;
    }

}
