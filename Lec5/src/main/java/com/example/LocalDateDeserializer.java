package com.example;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDate;

public class LocalDateDeserializer extends JsonDeserializer<LocalDate> {

@Override
    public LocalDate deserialize(JsonParser parser, DeserializationContext ctx) throws IOException {
    return LocalDate.parse(parser.getText());
}
}
