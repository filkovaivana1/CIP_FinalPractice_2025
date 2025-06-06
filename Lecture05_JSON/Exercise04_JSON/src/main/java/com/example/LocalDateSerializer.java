package com.example;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDate;

class LocalDateSerializer extends JsonSerializer<LocalDate> {

    @Override
    public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider providers) throws IOException {
            gen.writeString(value.toString());
    }

}

//class LocalDateSerializer extends JsonSerializer<LocalDate> {

//    @Override
//    public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
//        gen.writeString(value.toString());
//    }
//}
