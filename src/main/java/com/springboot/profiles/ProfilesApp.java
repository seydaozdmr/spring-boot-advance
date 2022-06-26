package com.springboot.profiles;

import com.springboot.injection.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProfilesApp {
    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(ProfilesApp.class);

        FoodProviderService foodProviderService=(FoodProviderService) ctx.getBean("foodProviderService",FoodProviderService.class);
        foodProviderService.provideLunchSet().stream().forEach(System.out::println);
    }
}
