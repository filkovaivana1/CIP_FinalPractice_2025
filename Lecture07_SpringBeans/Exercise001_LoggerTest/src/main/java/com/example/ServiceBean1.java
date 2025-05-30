package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ServiceBean1 {

    Logger logger = LoggerFactory.getLogger(ServiceBean1.class);

    @PostConstruct
    public void init() {
        logger.info("ServiceBean1 initialized. ");
    }

    @PreDestroy
    public void destroy() {
        logger.info("ServiceBean1 destroyed. ");
    }

}
