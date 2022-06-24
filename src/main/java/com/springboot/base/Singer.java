package com.springboot.base;

import org.springframework.stereotype.Component;

@Component
public class Singer {
    private String artist;

    public Singer(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
}
