package com.example.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiKeyProperties {

    private static final String API_KEY = "12345";

    public String getAPI_KEY() {
        return API_KEY;
    }
}
