package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Serialization
        Student student = new Student("John Doe", 20, "johndoe@example.com");
        String json = mapper.writeValueAsString(student);
        System.out.println("Serialized JSON: " + json);

        // Deserialization
        Student deserializedStudent = mapper.readValue(json, Student.class);
        System.out.println("Deserialized Student: " + deserializedStudent.getName());
    }
}