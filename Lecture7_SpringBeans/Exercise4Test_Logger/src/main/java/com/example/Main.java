package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

       ApplicationContext applicationContext = SpringApplication.run(Main.class,args);
        LibraryService1 libraryService1 = applicationContext.getBean(LibraryService1.class);
        LibraryService2 libraryService2 = applicationContext.getBean(LibraryService2.class);

    }
}