package com.example.logger;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class LibraryLOgger implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet(){
        System.out.println("Bean initialized at: " + System.currentTimeMillis());
    }

    @Override
    public void destroy(){
        System.out.println("Bean destroyed at: " + System.currentTimeMillis());
    }
}
