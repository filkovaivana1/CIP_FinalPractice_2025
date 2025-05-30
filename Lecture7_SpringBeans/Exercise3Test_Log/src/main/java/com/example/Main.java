package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

      ApplicationContext context = SpringApplication.run(Main.class, args);
        LibraryService1 libraryService1 = context.getBean(LibraryService1.class);
        libraryService1.message();
        LibraryService2 libraryService2 = context.getBean(LibraryService2.class);
        libraryService2.message();
    }
}