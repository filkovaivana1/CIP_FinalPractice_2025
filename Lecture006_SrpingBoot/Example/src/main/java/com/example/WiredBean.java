package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class WiredBean {

    @PostConstruct
    public void init() {
        System.out.println("Wired bean is created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Wired bean is destroyed");
    }

    public String message() {
        return "Message from wired bean";
    }


}
