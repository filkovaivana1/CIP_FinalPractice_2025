package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class LogFileChecker {
    private static final Logger logger = LoggerFactory.getLogger(LogFileChecker.class);

    @PostConstruct
    public void checkLogFile() {
        Path logFilePath = Path.of("testlog.txt");

        if (Files.exists(logFilePath)) {
            try {
                String content = Files.readString(logFilePath);
                logger.info("Log file found. Content:\n" + content);
                System.out.println("Log file found. Content:\n" + content);
            } catch (IOException e) {
                logger.error("Error reading log file", e);
            }
        } else {
            logger.warn("Log file not found");
        }
    }
}
