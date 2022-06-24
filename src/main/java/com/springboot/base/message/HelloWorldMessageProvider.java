package com.springboot.base.message;

import org.springframework.stereotype.Component;

//@Component
public class HelloWorldMessageProvider implements MessageProvider{

    @Override
    public String getMessage() {
        return "hello world";
    }
}
