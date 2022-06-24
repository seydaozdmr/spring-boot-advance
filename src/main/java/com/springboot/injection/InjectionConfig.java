package com.springboot.injection;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.yaml.snakeyaml.constructor.Construct;

import java.lang.reflect.Constructor;

@Configuration
public class InjectionConfig {
    @Bean
    @Primary
    public Foo fooOne(){
        return new FooImpl();
    }

    @Bean
    public Foo fooTwo(){
        return new FooImpl2();
    }
    @Bean
    public Bar barOne(){
        return new BarImpl();
    }

    @Bean(autowire = Autowire.BY_NAME)
    @Lazy
    public Target targetByName(){
        return new Target();
    }

    @Bean(autowire = Autowire.BY_TYPE)
    @Lazy
    public Target targetByType(){
        return new Target();
    }
    @Bean
    @Lazy
    public Target targetConstructor(){
        return new Target(fooOne(),barOne());
    }

}
