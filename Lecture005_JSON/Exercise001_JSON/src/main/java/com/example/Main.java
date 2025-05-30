package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        Student student = new Student("John Doe", 20, "john@example.com", List.of("Course1", "Course2"), Map.of("course1", 2d, "course2", 3d), LocalDate.now().minusYears(20).plusDays(15));

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer1());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer1());
        objectMapper.registerModule(module);

//        serialize
        String json = objectMapper.writeValueAsString(student);
        System.out.println("Serialized JSON: " + json);

//        deserialized
        Student student1 = objectMapper.readValue(json, Student.class);
        System.out.println("Deserialized student name: " + student1.getName());
        System.out.println("Deserialized student age: " + student1.getAge());
        System.out.println("Deserialized student email: " + student1.getEmail());
        student1.getCourses().forEach(course -> {
            System.out.println(course);
        });
        student1.getGrades().forEach((key, value) -> {
            System.out.println("Course name: " + key + " grade: " + value);
        });
        System.out.println("Deserialized student b-day: " + student1.getBirthday());

    }
}