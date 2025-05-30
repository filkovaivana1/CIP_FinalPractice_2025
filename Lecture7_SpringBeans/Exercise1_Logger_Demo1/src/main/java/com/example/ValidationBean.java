package com.example;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import jakarta.validation.Valid;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class ValidationBean {

    public String concatStrings(@Valid @NonNull String first, @Size(max=3) String second){
        return first+" "+second;
    }
}
