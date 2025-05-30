package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentContoller {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
       return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
       return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @GetMapping("/{courseId}/{studentId}")
    public Student addStudentToCourse(@PathVariable Long courseId, @PathVariable Long studentId){
        return studentService.addStudentToCourse(studentId, courseId);
    }

    @PostMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }



}
