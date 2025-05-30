package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private SecondBean secondBean;

    @Autowired
    private WiredBEan wiredBEan;

    @Value("${first.property}")
    private String firstProperty;

    @Value("${second.property}")
    private String secondProperty;

    @Autowired
    private ApplicationProperties applicationProperties;

    public TestService(SecondBean secondBean) {
        this.secondBean = secondBean;
    }

    public String test() {
        return "Message from Test service. " +
                "Incoming message from second bean: " +
                secondBean.message()  +
                ". Incoming message from wired bean: " +
                wiredBEan.message() +
                ". First property value: " + firstProperty +
                ". Second property value: " + secondProperty +

                ". Application property one value: " + applicationProperties.getOne();

    }

}
