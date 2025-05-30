package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class WiredBean {

    @PostConstruct
    public void init() {
        System.out.println("Lifecycle bean initialized!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Lifecycle bean is destroyed!");
    }

    public String message() {
        return "wired bean message";
    }

}
