package com.springboot.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        System.out.println("Bu application contextde "+beanDefinitionCount+" adet bean yaratılmıştır.");
        var beanNames=beanFactory.getBeanDefinitionNames();
        Arrays.stream(beanNames).forEach(System.out::println);
    }
}
