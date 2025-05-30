package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class TestService {

    @Autowired
    private SecondBean secondBean;

    @Autowired
    private WiredBean wiredBean;

    @Value("${first.proprety}")
    private String myFirstproperty;

    //   @Value("#{${second.proprety} ? 'defaultProperty'}")
    // @Value("#{${procmultiplier} == 0 ? 1 : ${procmultiplier}}")
    //  @Value("#{someBean.someProperty ?: 'default'}")
    @Value("${second.proprety:someee}")
    private String secondProperty;

    public String test() {
        return "This is a message from test service! " + secondBean.message()
                + " first property  " + myFirstproperty
                + " second property "+secondProperty
                + " wired bean "+ wiredBean.message()
                + " property one " + ;
    }
}
