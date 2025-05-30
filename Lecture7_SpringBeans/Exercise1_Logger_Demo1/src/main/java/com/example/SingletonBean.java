package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public String name;

    @PostConstruct
    private void postConstruct() {
        System.out.println("Singleton construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Singleton pre destroy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}