package com.springboot.beandestroy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ShutdownHookBean implements ApplicationContextAware {
    private ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if(applicationContext instanceof GenericApplicationContext)
            ((GenericApplicationContext) applicationContext).registerShutdownHook();
    }
}
