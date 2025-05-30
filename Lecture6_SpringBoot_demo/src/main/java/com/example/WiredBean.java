package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
@Service
public class WiredBean {

    @PostConstruct
    public void init() {
        System.out.println("LifecycleBean is initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("LifecycleBean is destroyed");
    }
    public String message(){
        return "from autowired bean!";
    }
}
