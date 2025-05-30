package com.example.controller;

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
    private CourseService courseService;

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{courseId}/students")
    public List<Student> getStudentsForCourse(@PathVariable Long courseId){
        System.out.println("HERE");
        return studentService.getStudentsByCourseId(courseId);
    }

    @PostMapping("/{courseId}/students")
    public ResponseEntity<Student> addStudentToCourse(@PathVariable Long courseId, @RequestBody Map<String, Long> body){
        Long studentId = body.get("studentId");
        return ResponseEntity.ok(studentService.addStudentToCourse(studentId, courseId));
    }

    @DeleteMapping("/{courseId}/students/{studentId}")
    public ResponseEntity<Void> deleteStudentFromCourse(@PathVariable Long courseId, @PathVariable Long studentId){
        studentService.removeStudentFromCourse(courseId, studentId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{courseId}/students/{studentId}/grades")
    public ResponseEntity<Grade> addGrade(@PathVariable Long courseId, @PathVariable Long studentId, @RequestBody Map<String, Double> body){
        Double gradeValue = body.get("gradeValue");
        Grade grade = studentService.addGrade(courseId, studentId, gradeValue);
        return ResponseEntity.ok(grade);
    }

    @GetMapping("/{courseId}/average-grade")
    public ResponseEntity<Double> getAverageGrade(@PathVariable Long courseId){
        Double avg = studentService.getAverageGradeForCourse(courseId);
        return ResponseEntity.ok(avg);
    }

//    @Autowired
//    private CourseService courseService;
//    @Autowired
//    private StudentService studentService;
//
//    @GetMapping
//    public List<Course> getAllCourses() {
//        return courseService.getAllCourses();
//    }
//
//    @GetMapping("/{courseId}/students")
//    public List<Student> getStudentsInCourse(@PathVariable Long courseId) {
//        return studentService.getStudentsByCourse(courseId);
//    }
//
//    @PostMapping("/{courseId}/students")
//    public ResponseEntity<Student> addStudentToCourse(@PathVariable Long courseId, @RequestBody Map<String, Long> body) {
//        Long studentId = body.get("studentId");
//        Student student = studentService.addStudentToCourse(courseId, studentId);
//        return ResponseEntity.ok(student);
//    }
//
//    @DeleteMapping("/{courseId}/students/{studentId}")
//    public ResponseEntity<Void> removeStudentFromCourse(@PathVariable Long courseId, @PathVariable Long studentId) {
//        studentService.removeStudentFromCourse(courseId, studentId);
//        return ResponseEntity.noContent().build();
//    }
//
//    @PostMapping("/{courseId}/students/{studentId}/grades")
//    public ResponseEntity<Grade> addGrade(@PathVariable Long courseId, @PathVariable Long studentId, @RequestBody Map<String, Double> body) {
//        Double gradeValue = body.get("gradeValue");
//        Grade grade = studentService.addGrade(courseId, studentId, gradeValue);
//        return ResponseEntity.ok(grade);
//    }
//
//    @GetMapping("/{courseId}/average-grade")
//    public ResponseEntity<Double> getAverageGrade(@PathVariable Long courseId) {
//        Double avg = studentService.getAverageGradeForCourse(courseId);
//        return ResponseEntity.ok(avg);
//    }
}
