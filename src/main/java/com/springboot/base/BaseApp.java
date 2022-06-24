package com.springboot.base;

import com.springboot.base.message.MessageRenderer;
import com.springboot.base.message.StandartOutMessageRenderer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BaseApp {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BaseApp.class);
        Singer tarkan = (Singer) ctx.getBean("singer");
        System.out.println(tarkan.getArtist());

//        MessageRenderer renderer=(MessageRenderer) ctx.getBean("standartOutMessageRenderer");
//        renderer.render();
        MessageRenderer renderer1=(MessageRenderer) ctx.getBean(StandartOutMessageRenderer.class);
        renderer1.render();
    }
}
