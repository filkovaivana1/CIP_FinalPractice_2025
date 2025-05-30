package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

      ApplicationContext context = SpringApplication.run(Main.class, args);
       ServiceBean1 serviceBean1 = context.getBean(ServiceBean1.class);
        ServiceBean2 serviceBean2 = context.getBean(ServiceBean2.class);



    }
}