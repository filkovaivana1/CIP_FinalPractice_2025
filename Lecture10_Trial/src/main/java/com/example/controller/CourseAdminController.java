package com.example.controller;

import com.example.model.Course;
import com.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController
//@RequestMapping("/courses-admin")
@RestController
@RequestMapping("/courses-admin")
public class CourseAdminController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Long id){
        return courseService.getCourse(id);
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course course){
        course.setId(id);
       return courseService.saveCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id){
        courseService.deleteCourse(id);
    }
//    @Autowired
//    private CourseService courseService;
//
//    @GetMapping
//    public List<Course> getAllCourses() {
//        return courseService.getAllCourses();
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Course> getCourse(@PathVariable Long id) {
//        return courseService.getCourse(id);
//    }
//
//    @PostMapping
//    public Course createCourse(@RequestBody Course course) {
//        return courseService.saveCourse(course);
//    }
//
//    @PutMapping("/{id}")
//    public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {
//        course.setId(id);
//        return courseService.saveCourse(course);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteCourse(@PathVariable Long id) {
//        courseService.deleteCourse(id);
//    }
}
