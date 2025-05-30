package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws Exception {
       ObjectMapper objectMapper = new ObjectMapper();
       StudentWithGrades student = new StudentWithGrades("John Doe", 20, "john@example.com", Map.of("course1", 2d, "course2", 3d));
       String json = objectMapper.writeValueAsString(student);
        System.out.println("Serialized JSON: " + json);

       StudentWithGrades student1 = objectMapper.readValue(json, StudentWithGrades.class);
        System.out.println("Deserialized student name: " + student1.getName());
        System.out.println("Deserialized student age: " + student1.getAge());
        System.out.println("Deserialized student email: " + student1.getEmail());
        System.out.println("Deserialized student grades: ");
        student1.getGrades().forEach((key, value) -> {
            System.out.println("Course name: " + key + ", grade: " + value);
        });
    }
        //        ObjectMapper mapper = new ObjectMapper();
//
//        // Serialization
//        StudentWithGrades student = new StudentWithGrades("John Doe", 20, "test@test.com",
//                Map.of("course1", 2d,"course2",3d));
//        String json = mapper.writeValueAsString(student);
//        System.out.println("Serialized JSON: " + json);
//
//        // Deserialization
//        StudentWithGrades deserializedStudent = mapper.readValue(json, StudentWithGrades.class);
//        System.out.println("Deserialized Student name: " + deserializedStudent.getName());
//        System.out.println("Deserialized Student age: " + deserializedStudent.getAge());
//        System.out.println("Deserialized Student email: " + deserializedStudent.getEmail());
//        System.out.println("Deserialized Student grades:");
//        deserializedStudent.getGrades().forEach((key, value) -> {
//            System.out.println("Course name:"+key+", grade:"+value);
//        });
//    }
}