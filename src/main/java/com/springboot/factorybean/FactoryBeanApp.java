package com.springboot.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.security.MessageDigest;
@ComponentScan
public class FactoryBeanApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(FactoryBeanApp.class);
        MessageDigester digester=(MessageDigester) applicationContext.getBean("messageDigester");
        digester.digest("Seyda Özdemir");
    }

    @Configuration
    private static class Config{
        public Config(){}
        @Bean
        public MessageDigestFactoryBean messageDigestFactoryBean(){
            MessageDigestFactoryBean messageDigestFactoryBean=new MessageDigestFactoryBean();
            messageDigestFactoryBean.setAlgorithmName("SHA1");
            return messageDigestFactoryBean;
        }

        @Bean
        public MessageDigestFactoryBean defaultDigest(){
            return new MessageDigestFactoryBean();
        }

        @Bean
        public MessageDigester messageDigester() throws Exception {
            MessageDigester digester=new MessageDigester();
            digester.setDigest1(messageDigestFactoryBean().getObject());
            digester.setDigest2(defaultDigest().getObject());
            return digester;
        }
    }
}
