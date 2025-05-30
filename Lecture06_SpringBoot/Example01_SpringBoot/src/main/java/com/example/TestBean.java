package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TestBean {

    @Autowired
    private SecondBean secondBean;

    @Autowired
    WiredBean wiredBean;

    @Value("${first.property}")
    private String firstProperty;

    @Value("${second.property}")
    private String secondProperty;

    @Autowired
    private AppProperties appProperties;



    public String test() {
        return "This is message from the test service" +
                ", message from second bean: " + secondBean.message() +
                ", message from wired bean: " + wiredBean.message() +
                ", first property: " + firstProperty +
                ", second property: " + secondProperty +
                ", app property one: " + appProperties.getOne();
    }
}
