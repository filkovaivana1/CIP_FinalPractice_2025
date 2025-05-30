package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstConfuguration {

    @Bean
    public SecondBean secondBean() { return new SecondBean();}

}
