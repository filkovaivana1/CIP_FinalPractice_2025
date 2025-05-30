package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class
LibraryService2 {
    private static final Logger logger = LoggerFactory.getLogger(LibraryService2.class);

//    @PostConstruct
//    public void init() {
//        System.out.println("LibraryService2 initialized");
//        logger.info("LibraryService2 initialized");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("LibraryService2 is being destroyed");
//        logger.info("LibraryService2 is being destroyed");
//    }

    public void message() {
        System.out.println("Message from LibraryService2");
    }
}