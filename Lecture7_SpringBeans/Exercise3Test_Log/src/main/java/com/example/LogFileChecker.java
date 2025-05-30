package com.example;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class LogFileChecker {

    private Logger logger = LoggerFactory.getLogger(LogFileChecker.class);

    @PostConstruct
    public void checkLogFile() {

        Path logFilePath= Path.of("testLog.txt");

        if (Files.exists(logFilePath)) {

            try {
                String fileContent = Files.readString(logFilePath);
                logger.info("Log file found. Content: ");
                System.out.println(fileContent);
                logger.info(fileContent);

            } catch (IOException e) {
                logger.error("Error reading log file");
            }

        } else {
            logger.warn("Log file not found.");

        }


    }
}
