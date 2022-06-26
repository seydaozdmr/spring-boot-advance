package com.springboot.beandestroy;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class FileBean {
    private File file;

    public FileBean() throws IOException {
        file=new File("test.txt");
        if(!file.exists())
            file.createNewFile();
    }

    public File getFile() {
        return file;
    }
}
