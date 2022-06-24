package com.springboot.lookup;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope("prototype")
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
//        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RandomPrototypeBean {
    private int value;

    public RandomPrototypeBean(){
        value= new Random().nextInt();
        //System.out.println(value);
    }

    public int getValue() {
        return value;
    }
}
