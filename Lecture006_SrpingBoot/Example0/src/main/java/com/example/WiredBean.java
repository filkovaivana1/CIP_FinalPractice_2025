package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class WiredBean {

    @PostConstruct
    public void init() {
        System.out.println("Wired bean created at: " + System.currentTimeMillis());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Wired bean destroyed at: " + System.currentTimeMillis());
    }

    public String message() {
        return "Incoming message from wired bean";
    }
}
