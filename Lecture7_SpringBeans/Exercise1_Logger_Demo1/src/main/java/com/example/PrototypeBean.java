package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class PrototypeBean {

    public String name;

    @PostConstruct
    private void postConstruct() {
        System.out.println("Proto construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Proto pre destroy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
