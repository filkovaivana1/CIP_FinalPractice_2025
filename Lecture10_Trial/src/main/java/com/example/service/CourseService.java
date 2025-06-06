package com.example.service;

import com.example.model.Course;
import com.example.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getCourse(Long id){
        return courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Course not found"));
    }

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }

    public void deleteCourse(Long id){
        courseRepository.deleteById(id);
    }

    //    @Autowired
//    private CourseRepository courseRepository;
//
//    public List<Course> getAllCourses() {
//        return courseRepository.findAll();
//    }
//
//    public Optional<Course> getCourse(Long id) {
//        return courseRepository.findById(id);
//    }
//
//    public Course saveCourse(Course course) {
//        return courseRepository.save(course);
//    }
//
//    public void deleteCourse(Long id) {
//        courseRepository.deleteById(id);
//    }
}
