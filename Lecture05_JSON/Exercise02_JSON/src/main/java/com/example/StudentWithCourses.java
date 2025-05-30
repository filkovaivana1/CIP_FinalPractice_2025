package com.example;//import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

class StudentWithCourses {

   private String name;
   private int age;

   @JsonProperty("emailAddress")
   private String email;

   @JsonIgnore
   private List<String> courses;

    public StudentWithCourses() {
    }

    public StudentWithCourses(String name, int age, String email, List<String> courses) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.courses = courses;
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

    //    private String name;
//    private int age;
//    @JsonProperty("emailAddress")
//    private String email;
//
//    @JsonIgnore
//    private List<String> courses;
//
//
//    public StudentWithCourses() {
//    }
//
//    public StudentWithCourses(String name, int age, String email, List<String> courses) {
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.courses = courses;
//    }
//
//    public List<String> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(List<String> courses) {
//        this.courses = courses;
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
}