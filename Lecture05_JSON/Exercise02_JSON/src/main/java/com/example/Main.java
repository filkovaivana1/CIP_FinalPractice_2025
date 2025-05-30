package com.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

//        Serialization
        StudentWithCourses student = new StudentWithCourses("John Doe", 20, null, List.of("Course1", "Course2"));
        String json = objectMapper.writeValueAsString(student);
        System.out.println("Serialized JSON: " + json);

//       Deserialization
        StudentWithCourses student1 = objectMapper.readValue(json, StudentWithCourses.class);
        System.out.println("Deserialized student name: " + student1.getName());
//        System.out.println("Deserialized student courses: ");
//        student1.getCourses().forEach(course -> System.out.println("Course: " + course));

        //        ObjectMapper mapper = new ObjectMapper();
//
//        // Serialization
//        StudentWithCourses student = new StudentWithCourses("John Doe", 20, null, List.of("course1", "course2"));
//        String json = mapper.writeValueAsString(student);
//        System.out.println("Serialized JSON: " + json);
//
//        // Deserialization
//        StudentWithCourses deserializedStudent = mapper.readValue(json, StudentWithCourses.class);
//        System.out.println("Deserialized Student: " + deserializedStudent.getName());
    }
}