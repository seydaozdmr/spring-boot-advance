package com.springboot.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.cglib.proxy.Factory;

import java.security.MessageDigest;

public class MessageDigestFactoryBean implements FactoryBean<MessageDigest>, InitializingBean {
    private String algorithmName="MD5";

    private MessageDigest messageDigest=null;


    @Override
    public MessageDigest getObject() throws Exception {
        return messageDigest;
    }

    @Override
    public Class<?> getObjectType() {
        return MessageDigest.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        messageDigest=MessageDigest.getInstance(algorithmName);
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setAlgorithmName(String algorithmName){
        this.algorithmName=algorithmName;
    }
}
