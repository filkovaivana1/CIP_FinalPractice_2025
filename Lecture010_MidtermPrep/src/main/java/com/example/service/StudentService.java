package com.example.service;

import com.example.model.Course;
import com.example.model.Student;
import com.example.repository.CourseRepository;
import com.example.repository.GradeRepository;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

    public List<Student> getStudentsByCourse(Long id){
      Optional<Course> courseOptional = courseRepository.findById(id);
      if(courseOptional.isPresent()){
      return new ArrayList<>(courseOptional.get().getStudents());
      } else {
          return new ArrayList<>();
      }
    }

    public Student addStudentToCourse(Long studentId, Long courseId){
        Course course = courseRepository.findById(courseId).orElseThrow();
        Student student = studentRepository.findById(studentId).orElseThrow();
        course.getStudents().add(student);
        student.getCourses().add(course);
        courseRepository.save(course);
      return studentRepository.save(student);

    }

    public Student removeStudentFromCourse(Long studentId, Long courseId){
        Course course = courseRepository.findById(courseId).orElseThrow();
        Student student = studentRepository.findById(studentId).orElseThrow();
        course.getStudents().remove(student);
        student.getCourses().remove(course);
        courseRepository.save(course);
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow();
    }

    public Student updateStudent(Long id, Student student){
        student.setId(id);
       return studentRepository.save(student);
    }

}
