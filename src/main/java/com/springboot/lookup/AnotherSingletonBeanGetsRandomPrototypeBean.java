package com.springboot.lookup;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Random;

@Component
public class AnotherSingletonBeanGetsRandomPrototypeBean {

    @Resource(name="randomPrototypeBean")
    RandomPrototypeBean randomPrototypeBean;

    public void writeRandomValue(){
        System.out.println(randomPrototypeBean.getValue());
    }

}
