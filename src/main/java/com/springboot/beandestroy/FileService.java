package com.springboot.beandestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class FileService implements DisposableBean {
    private final FileBean fileBean;
    private BufferedOutputStream os;

    public FileService(FileBean fileBean) {
        this.fileBean = fileBean;
        try {
            os=new BufferedOutputStream(new FileOutputStream(fileBean.getFile()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeNumbers() throws IOException {
        for(int i=0;i<100;i++){
            //String'in byte'larını
            os.write(String.valueOf(i+"\n").getBytes());
        }
    }

    @Override
    public void destroy() throws Exception {
        if(os!=null)
            os.close();
    }

    @PreDestroy
    public void myDestroy(){
        System.out.println("my destroy method");
    }
}
