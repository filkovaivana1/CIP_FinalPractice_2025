package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private SecondBean secondBean;

    @Autowired
    private WiredBean wiredBean;

    @Autowired
    ApplicationProperties applicationProperties;

    @Value("${first.property}")
    private String firstProperty;

    @Value("${second.property}")
    private String secondProperty;



    public TestService(SecondBean secondBean) {
        this.secondBean = secondBean;
    }

    public String test() {
        return "Message from testService. " +
                " Message from second bean: " + secondBean.message() +
                " Message from wired bean: " + wiredBean.message() +
                " first property value: " + firstProperty
                 + " application properties property one: " + applicationProperties.getOne();


    }

}
