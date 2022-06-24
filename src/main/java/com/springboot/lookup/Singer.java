package com.springboot.lookup;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Singer {
    private String lyric="Some lyrics";

    public void sing(){
        System.out.println(lyric);
    }
}
