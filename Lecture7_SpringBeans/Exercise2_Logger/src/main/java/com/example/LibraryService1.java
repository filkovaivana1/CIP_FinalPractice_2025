package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class LibraryService1
//        implements InitializingBean, DisposableBean
{
    private static final Logger logger = LoggerFactory.getLogger(LibraryService1.class);

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        logger.info("Bean LibraryService1 is initialized");
//        System.out.println("Bean LibraryService1 is initialized");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Bean LibraryService1 is destroyed");
//    }

//    @PostConstruct
//    public void init() {
//        System.out.println("LibraryService1 initialized");
//        logger.debug("LibraryService1 initialized");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        logger.debug("LibraryService1 is being destroyed");
//    }

    public void message() {
        System.out.println("Message from LibraryService1");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("LibraryService1 bean created");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("LibraryService1 bean destroyed");
//    }

}