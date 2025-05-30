package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        Student student = new Student("John Doe", 20, null, LocalDate.now().minusYears(20).plusDays(15), List.of("Curse1", "Course2"), Map.of("course1", 2d, "course2", 3d) );

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocaldateSrizalizer());
        module.addDeserializer(LocalDate.class, new LocaldateDeserializer());
        objectMapper.registerModule(module);

        String json = objectMapper.writeValueAsString(student);
        System.out.println("Serialized student: " + json);

       Student student1 = objectMapper.readValue(json, Student.class);
        System.out.println("Deserialized student name: " + student1.getName());
        System.out.println("Deserialized student age: " + student1.getAge());
        System.out.println("Deserialized student email: " + student1.getEmail());
        student1.getCourses().forEach(course -> System.out.println(course));
        student1.getGrades().forEach((key, value) -> {
            System.out.println("Course name: " + key + ", grade: " + value);
        });
        System.out.println("Deserialized b-day " + student1.getBirthday());

    }
}