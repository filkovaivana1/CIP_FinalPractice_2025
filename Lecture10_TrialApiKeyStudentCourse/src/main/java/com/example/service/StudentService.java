package com.example.service;

import com.example.model.Course;
import com.example.model.Grade;
import com.example.model.Student;
import com.example.repository.CourseRepository;
import com.example.repository.GradeRepository;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public void removeStudent(Long id){
        studentRepository.findById(id).ifPresent(
                student -> {
                    studentRepository.deleteById(id);
                }
        );
    }

    public List<Student> getStudentsByCourseId(Long id){
       Optional<Course> courseOptional = courseRepository.findById(id);
       if(courseOptional.isPresent()){
           return new ArrayList<>(courseOptional.get().getStudents());
       } else {
           return new ArrayList<>();
       }
    }

    public Student addStudentToCourse(Long courseId, Long studentId){
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Student not found"));
        Course course = courseRepository.findById(courseId).orElseThrow(() -> new RuntimeException("Course not found"));

        student.getCourses().add(course);
        course.getStudents().add(student);

        courseRepository.save(course);
        return studentRepository.save(student);
    }

    public Student removeStudentFromCourse(Long courseId, Long studentId){
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Student not found"));
        Course course = courseRepository.findById(courseId).orElseThrow(() -> new RuntimeException("Course not found"));

        student.getCourses().remove(course);
        course.getStudents().remove(student);

        courseRepository.save(course);
        return studentRepository.save(student);
    }

    public Grade addGrade(Long studentId, Long courseId, Double gradeValue){
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Student not found"));
        Course course = courseRepository.findById(courseId).orElseThrow(() -> new RuntimeException("Course not found"));

        Grade grade = new Grade(gradeValue, course, student);
        return gradeRepository.save(grade);
    }

    public Double getAverageGradeForCourse(Long courseId){
        List<Grade> grades = gradeRepository.findByCourseId(courseId);
        return grades.stream().collect(Collectors.averagingDouble(grade -> grade.getGradeValue()));
    }

}
