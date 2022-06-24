package com.springboot.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StandardLookupDemoBean implements DemoBean{
    private Singer mySinger;


    @Autowired
    public void setMySinger(Singer singer){
        this.mySinger=singer;
    }

    @Override
    public Singer getMySinge() {
        return this.mySinger;
    }

    @Override
    public void doSomething() {
        mySinger.sing();
    }
}
