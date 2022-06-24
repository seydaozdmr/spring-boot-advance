package com.springboot.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class AbstractRandomPrototypeBean implements RandomValueBean{
    @Lookup("randomPrototypeBean")
    public RandomPrototypeBean getRandomPrototypeBean(){
        return null;
    }

    @Override
    public void writeRandomValue() {
        System.out.println(getRandomPrototypeBean().getValue());
    }
}
