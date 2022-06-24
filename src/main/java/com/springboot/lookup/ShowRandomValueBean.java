package com.springboot.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShowRandomValueBean  implements RandomValueBean{
    private RandomPrototypeBean randomPrototypeBean;

    @Autowired
    public void setRandomPrototypeBean(RandomPrototypeBean randomPrototypeBean){
        this.randomPrototypeBean=randomPrototypeBean;
    }

    @Override
    public RandomPrototypeBean getRandomPrototypeBean() {
        return randomPrototypeBean;
    }

    @Override
    public void writeRandomValue() {
        System.out.println(randomPrototypeBean.getValue());
    }
}
