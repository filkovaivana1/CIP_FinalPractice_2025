package com.example.logs;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DebugLogs {

    Logger logger = LoggerFactory.getLogger(DebugLogs.class);

    @PostConstruct
    public void postConstruct(){
        logger.info("This is info log");
        logger.debug("This is debug log");
    }
}
