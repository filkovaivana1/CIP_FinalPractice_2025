package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
//        ObjectMapper objectMapper = new ObjectMapper();
//        StudentWithBirthday student = new StudentWithBirthday("John Doe", 20, "john@example.com", LocalDate.now());
//
//        SimpleModule module = new SimpleModule();
//        module.addSerializer(LocalDate.class, new LocalDateSerializer());
//        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
//        objectMapper.registerModule(module);
//
//        String json = objectMapper.writeValueAsString(student);
//        System.out.println("Serialized JSON: " + json);
//
//        StudentWithBirthday student1 = objectMapper.readValue(json, StudentWithBirthday.class);
//        System.out.println("Deserialized student birthday: " + student1.getBirthday());



        ObjectMapper objectMapper = new ObjectMapper();
        StudentWithBirthday student = new StudentWithBirthday("John Doe", 20, "john.example.com", LocalDate.now());

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        objectMapper.registerModule(module);

        String json = objectMapper.writeValueAsString(student);
        System.out.println("Serialized JSON: " + json);
//
        // Deserialization
        StudentWithBirthday deserializedStudentWithBirthday = objectMapper.readValue(json, StudentWithBirthday.class);
        System.out.println("Deserialized Student birthday: " + deserializedStudentWithBirthday.getBirthday());
    }
}