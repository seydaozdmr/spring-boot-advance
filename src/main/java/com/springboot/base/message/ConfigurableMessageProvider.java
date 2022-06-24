package com.springboot.base.message;

import org.springframework.beans.factory.annotation.Value;

public class ConfigurableMessageProvider implements MessageProvider{
    private String message;

    public ConfigurableMessageProvider(@Value("Configurable message") String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
