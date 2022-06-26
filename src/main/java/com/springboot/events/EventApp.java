package com.springboot.events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EventApp {
    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(EventApp.class);

        Publisher publisher=(Publisher) ctx.getBean("publisher");
        publisher.publish("Hello World");
        publisher.publish("Hello Java");

    }
}
