package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class WiredBEan {

    @PostConstruct
    public void init() {
        System.out.println("Wired bean created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Wired bean destroyed");
    }

    public String message() {return "Wired bean message";}

}
