package com.example.controller;

import com.example.Main;
import com.example.model.Course;
import com.example.model.Grade;
import com.example.model.Student;
import com.example.service.CourseService;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public List<Student> getStudentsByCourseId(@PathVariable Long id){
        return studentService.getStudentsByCourseId(id);
    }

    @PostMapping("/{courseId}/students/{studentId}")
    public ResponseEntity<Student> addStudentToCourse(@PathVariable Long studentId, @PathVariable Long courseId){
        try {
            return ResponseEntity.ok(studentService.addStudentToCourse(courseId, studentId));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{courseId}/students/{studentId}")
    public ResponseEntity<Void> removeStudentFromCourse(@PathVariable Long studentId, @PathVariable Long courseId){
        try {
           studentService.removeStudentFromCourse(courseId, studentId);
           return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{courseId}/students/{studentId}/grades")
    public ResponseEntity<Grade> addGrade(@PathVariable Long courseId, @PathVariable Long studentId, @RequestBody Map<String, Double> body){
        Double gradeValue = body.get("gradeValue");
        try {
            return ResponseEntity.ok(studentService.addGrade(studentId, courseId, gradeValue));

        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{courseId}/average-grade")
    public ResponseEntity<Double> getAverageGrade(@PathVariable Long courseId){
            return ResponseEntity.ok(studentService.getAverageGradeForCourse(courseId));
    }



}
