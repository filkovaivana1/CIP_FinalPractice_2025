package com.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private int age;

    @JsonProperty("emailAddress")
    private String email;

//    @JsonIgnore
    private List<String> courses;

    private Map<String, Double> grades;

    private LocalDate birthday;

    public Student() {
    }

    public Student(String name, int age, String email, List<String> courses, Map<String, Double> grades, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.courses = courses;
        this.grades = grades;
        this.birthday = birthday;
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

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
