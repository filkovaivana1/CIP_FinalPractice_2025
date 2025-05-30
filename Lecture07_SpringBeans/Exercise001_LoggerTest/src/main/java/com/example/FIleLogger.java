package com.example;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class FIleLogger {

    private Logger logger = LoggerFactory.getLogger(FIleLogger.class);

    @PostConstruct
    public void checkLogFile() {

        Path filePath = Path.of("testLog.txt");

        if (Files.exists(filePath)) {
            try{
            String content = Files.readString(filePath);
            logger.info("Log file found. Content: ");
            logger.info(content);
            } catch (IOException e) {
                logger.warn("Error happened while reading the file");
            }
        } else {
            logger.error("Log file not found. ");

        }


    }


}
