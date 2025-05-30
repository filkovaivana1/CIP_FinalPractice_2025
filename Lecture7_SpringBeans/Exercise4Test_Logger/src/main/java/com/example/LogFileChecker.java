package com.example;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class LogFileChecker {

    private Logger logger = LoggerFactory.getLogger(LogFileChecker.class);

    @PostConstruct
    public void checkLogFile() {

        Path logFilePath = Path.of("testLog.txt");

        if (Files.exists(logFilePath)) {
            try {
                String content = Files.readString(logFilePath);
                logger.info("Log file found. Content: ");
                logger.info(content);
            } catch (IOException e) {
                logger.warn("Error while reading the log file");
            }
        } else {
            logger.error("Log file not found");
        }


    }
}
