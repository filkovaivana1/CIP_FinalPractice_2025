package com.example.service;

import com.example.model.Course;
import com.example.model.Grade;
import com.example.model.Student;
import com.example.repository.CourseRepository;
import com.example.repository.GradeRepository;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

//@Service
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private GradeRepository gradeRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudent(Long id){
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found !"));
    }

    public Student saveStudent(Student student){
       return studentRepository.save(student);
    }

    public void deleteStudent(Long id){
        studentRepository.findById(id).ifPresent(student ->
                studentRepository.deleteById(id));
    }

    public List<Student> getStudentsByCourseId(Long courseId){
       Optional<Course> course = courseRepository.findById(courseId);
       if(course.isPresent()){
          Course c = course.get();
          return new ArrayList<>(c.getStudents());
       } else {
          return new ArrayList<>();
       }
    }

    public Student addStudentToCourse(Long studentId, Long courseId){
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Student not found"));
        Course course = courseRepository.findById(courseId).orElseThrow(() -> new RuntimeException("Course not found"));
        student.getCourses().add(course);
        course.getStudents().add(student);
        courseRepository.save(course);
        return studentRepository.save(student);
    }

    public void removeStudentFromCourse(Long courseId, Long studentId){
        Student student = studentRepository.findById(studentId).orElseThrow();
        Course course = courseRepository.findById(courseId).orElseThrow();
        student.getCourses().remove(course);
        course.getStudents().remove(student);
        courseRepository.save(course);
        studentRepository.save(student);
    }

    public Grade addGrade(Long courseId, Long studentId, Double gradeValue){
        Course course = courseRepository.findById(courseId).orElseThrow();
        Student student = studentRepository.findById(studentId).orElseThrow();
        Grade grade = new Grade(gradeValue, student, course);
        return gradeRepository.save(grade);
    }

    public Double getAverageGradeForCourse(Long courseId){
        List<Grade> grades = gradeRepository.findByCourseId(courseId);
        return grades.stream().collect(Collectors.averagingDouble(Grade::getGradeValue));
    }

//    @Autowired
//    private StudentRepository studentRepository;
//    @Autowired
//    private CourseRepository courseRepository;
//    @Autowired
//    private GradeRepository gradeRepository;
//
//    public List<Student> getAllStudents() {
//        return studentRepository.findAll();
//    }
//
//    public Optional<Student> getStudent(Long id) {
//        return studentRepository.findById(id);
//    }
//
//    public Student saveStudent(Student student) {
//        return studentRepository.save(student);
//    }
//
//    public void deleteStudent(Long id) {
//        studentRepository.deleteById(id);
//    }
//
//    public List<Student> getStudentsByCourse(Long courseId) {
//        // Try to find the course by ID
//        Optional<Course> optionalCourse = courseRepository.findById(courseId);
//
//        if (optionalCourse.isPresent()) {
//            Course course = optionalCourse.get();
//            Set<Student> studentsSet = course.getStudents();
//            return new ArrayList<>(studentsSet);
//        } else {
//            // Return empty list if course doesn't exist
//            return new ArrayList<>();
//        }
//    }
//
//    public Student addStudentToCourse(Long courseId, Long studentId) {
//        Course course = courseRepository.findById(courseId).orElseThrow();
//        Student student = studentRepository.findById(studentId).orElseThrow();
//        course.getStudents().add(student);
//        student.getCourses().add(course);
//        courseRepository.save(course);
//        return studentRepository.save(student);
//    }
//
//    public void removeStudentFromCourse(Long courseId, Long studentId) {
//        Course course = courseRepository.findById(courseId).orElseThrow();
//        Student student = studentRepository.findById(studentId).orElseThrow();
//        course.getStudents().remove(student);
//        student.getCourses().remove(course);
//        courseRepository.save(course);
//        studentRepository.save(student);
//    }
//
//    public Grade addGrade(Long courseId, Long studentId, Double gradeValue) {
//        Course course = courseRepository.findById(courseId).orElseThrow();
//        Student student = studentRepository.findById(studentId).orElseThrow();
//        Grade grade = new Grade(gradeValue, student, course);
//        return gradeRepository.save(grade);
//    }
//
//    public Double getAverageGradeForCourse(Long courseId) {
//        List<Grade> grades = gradeRepository.findByCourseId(courseId);
//        return grades.stream().collect(Collectors.averagingDouble(Grade::getGradeValue));
//    }
}
