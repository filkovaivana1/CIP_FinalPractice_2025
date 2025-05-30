package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ServiceBean2 {
    Logger logger = LoggerFactory.getLogger(ServiceBean2.class);

    @PostConstruct
    public void init() {
        logger.debug("ServiceBean2 initialized. ");
    }

    @PreDestroy
    public void destroy() {
        logger.info("ServiceBean2 destroyed. ");
    }

}
