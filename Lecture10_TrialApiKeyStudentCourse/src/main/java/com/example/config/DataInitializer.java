package com.example.config;

import com.example.model.Course;
import com.example.model.Grade;
import com.example.model.Student;
import com.example.repository.CourseRepository;
import com.example.repository.GradeRepository;
import com.example.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(StudentRepository studentRepository, CourseRepository courseRepository, GradeRepository gradeRepository){
        return args -> {
            Student student1 = new Student("Alice");
            Student student2 = new Student("Bob");
            Student student3 = new Student("Charlie");

            studentRepository.saveAll(List.of(student1, student2, student3));

            Course course1 = new Course("Mathematics");
            Course course2 = new Course("Physics");
            Course course3 = new Course("Chemistry");

            courseRepository.saveAll(List.of(course1, course2, course3));

            assignStudentToCourse(student1, course1);
            assignStudentToCourse(student2, course1);
            assignStudentToCourse(student2, course2);
            assignStudentToCourse(student3, course2);
            assignStudentToCourse(student1, course3);
            assignStudentToCourse(student3, course3);

            studentRepository.saveAll(List.of(student1, student2, student3));
            courseRepository.saveAll(List.of(course1, course2, course3));

            Grade grade1 = new Grade(5.0, course1, student1);
            Grade grade2 = new Grade(6.0, course1, student2);
            Grade grade3 = new Grade(5.5, course2, student2);
            Grade grade4 = new Grade(6.5, course2, student3);
            Grade grade5 = new Grade(6.0, course3, student1);
            Grade grade6 = new Grade(5.0, course3, student3);

            gradeRepository.saveAll(List.of(grade1, grade2, grade3, grade4, grade5, grade6));

        };
    }

    public void assignStudentToCourse(Student student, Course course){
        student.getCourses().add(course);
        course.getStudents().add(student);
    }

}
