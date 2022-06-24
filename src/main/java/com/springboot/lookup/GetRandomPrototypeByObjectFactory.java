package com.springboot.lookup;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.stereotype.Component;

@Component
public class GetRandomPrototypeByObjectFactory {
    private final ObjectFactory<RandomPrototypeBean> randomPrototypeBeanObjectFactory;

    public GetRandomPrototypeByObjectFactory(ObjectFactory<RandomPrototypeBean> randomPrototypeBeanObjectFactory) {
        this.randomPrototypeBeanObjectFactory = randomPrototypeBeanObjectFactory;
    }

    public void writeRandomValue(){
        System.out.println(randomPrototypeBeanObjectFactory.getObject().getValue());
    }
}
