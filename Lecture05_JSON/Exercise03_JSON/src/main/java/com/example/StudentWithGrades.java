package com.example;//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

class StudentWithGrades {

    private String name;
    private int age;
    @JsonProperty("emailAddress")
    private String email;

    private Map<String, Double> grades;

    public StudentWithGrades() {
    }

    public StudentWithGrades(String name, int age, String email, Map<String, Double> grades) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }

    //    private String name;
//    private int age;
//
//    @JsonProperty("emailAddress")
//    private String email;
//
//    private Map<String, Double> grades;
//
//    public StudentWithGrades() {
//    }
//
//    public StudentWithGrades(String name, int age, String email, Map<String, Double> grades) {
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.grades = grades;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Map<String, Double> getGrades() {
//        return grades;
//    }
//
//    public void setGrades(Map<String, Double> grades) {
//        this.grades = grades;
//    }

    //    private String name;
//    private int age;
//    @JsonProperty("emailAddress")
//    private String email;
//    Map<String, Double> grades;
//
//    public StudentWithGrades() {
//    }
//
//    public StudentWithGrades(String name, int age, String email, Map<String, Double> grades) {
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.grades = grades;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Map<String, Double> getGrades() {
//        return grades;
//    }
//
//    public void setGrades(Map<String, Double> grades) {
//        this.grades = grades;
//    }


}