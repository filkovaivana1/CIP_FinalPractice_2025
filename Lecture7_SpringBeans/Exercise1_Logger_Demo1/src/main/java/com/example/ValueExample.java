package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueExample {

    @Value("some value")
    public String someValue;
}