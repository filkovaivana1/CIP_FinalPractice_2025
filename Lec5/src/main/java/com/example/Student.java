package com.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

class Student {

    private String name;
    private int age;

    @JsonProperty("emailAddress")
    private String email;

    private List<String> courses;

    private Map<String, Double> grades;

    private LocalDate birthdate;

    public Student() {
    }

    public Student(String name, int age, String email, List<String> courses, Map<String, Double> grades, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.courses = courses;
        this.grades = grades;
        this.birthdate = birthday;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}