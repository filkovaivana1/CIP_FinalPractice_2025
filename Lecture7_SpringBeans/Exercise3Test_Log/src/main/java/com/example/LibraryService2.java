package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class LibraryService2 {

    private Logger logger = LoggerFactory.getLogger(LibraryService2.class);
    @PostConstruct
    public void init() {
        logger.debug("LibraryService2 bean initialized.");

    }

    @PreDestroy
    public void destroy() {
        logger.debug("LibraryService2 bean destroyed.");

    }

    public void message() {
        logger.info("Incoming message from LibraryService2");
    }


}
