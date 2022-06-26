package com.springboot.beanfactorypostprocessor;

import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private String name="Seyda";

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                '}';
    }
}
