package com.example.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiKeyProperties {

    private static final String API_KEY = "e1c11dc9-9f1b-4d13-b3a1-a7f00ea39aca";

    public String getAPI_KEY() {
        return API_KEY;
    }
}
