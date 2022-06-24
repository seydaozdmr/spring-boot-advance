package com.springboot.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class AbstractLookupBean implements DemoBean{
    @Override
    @Lookup("singer")
    public Singer getMySinge() {
        return null;
    }

    @Override
    public void doSomething() {
        getMySinge().sing();
    }
}
