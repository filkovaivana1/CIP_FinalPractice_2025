package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController
//@RequestMapping("/students")
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id){
        return studentService.getStudent(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        student.setId(id);
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

    //    @Autowired
//    private StudentService studentService;
//
//    @GetMapping
//    public List<Student> getAllStudents() {
//        return studentService.getAllStudents();
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Student> getStudent(@PathVariable Long id) {
//        return studentService.getStudent(id);
//    }
//
//    @PostMapping
//    public Student createStudent(@RequestBody Student student) {
//        return studentService.saveStudent(student);
//    }
//
//    @PutMapping("/{id}")
//    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
//        student.setId(id);
//        return studentService.saveStudent(student);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudent(@PathVariable Long id) {
//        studentService.deleteStudent(id);
//    }
}
