package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        Student student = new Student("John Doe", 20, "john@example.com", List.of("course1", "course2"), Map.of("course1", 2d, "course2", 3d), LocalDate.now().minusYears(20));

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        objectMapper.registerModule(module);

        String json = objectMapper.writeValueAsString(student);

        System.out.println("Serialized student JSON: " + json);

        Student deserilizedStudent = objectMapper.readValue(json, Student.class);
        System.out.println("Deserialized student name: " + deserilizedStudent.getName());
        System.out.println("Deserialized student age: " + deserilizedStudent.getAge());
        System.out.println("Deserialized student email " + deserilizedStudent.getEmail());
        System.out.println("Serialized student courses: " );
        deserilizedStudent.getCourses().forEach(course -> System.out.println(course));
deserilizedStudent.getGrades().forEach((key, value)-> {
    System.out.println("Course name: "+ key + ", grade: " + value );
});
        System.out.println("Bithday: " + deserilizedStudent.getBirthdate());
    }
}