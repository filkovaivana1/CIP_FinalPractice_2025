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

import java.util.Arrays;
import java.util.List;

//@Configuration
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


          relateStudentToCourse(student1, course1);
            relateStudentToCourse(student2, course1);
            relateStudentToCourse(student2, course2);
            relateStudentToCourse(student3, course2);
            relateStudentToCourse(student1, course3);
            relateStudentToCourse(student3, course3);

            studentRepository.saveAll(List.of(student1, student2, student3));
            courseRepository.saveAll(List.of(course1, course2, course3));

            Grade grade1 = new Grade(5.0, student1, course1);
            Grade grade2 = new Grade(6.0, student2, course1);
            Grade grade3 = new Grade(4.5, student2, course2);
            Grade grade4 = new Grade(5.5, student3, course2);
            Grade grade5 = new Grade(6.0, student1, course3);
            Grade grade6 = new Grade(5.0, student3, course3);

            gradeRepository.saveAll(List.of(grade1, grade2, grade3, grade4, grade5, grade6));

        };
    }

    public void relateStudentToCourse(Student student, Course course){
        student.getCourses().add(course);
        course.getStudents().add(student);
    }

//

    ////////////////////////////////////
    //    @Bean
//    CommandLineRunner initData(StudentRepository studentRepo, CourseRepository courseRepo, GradeRepository gradeRepo) {
//        return args -> {
//            Student s1 = new Student("Alice");
//            Student s2 = new Student("Bob");
//            Student s3 = new Student("Charlie");
//            studentRepo.saveAll(Arrays.asList(s1, s2, s3));
//
//            Course c1 = new Course("Mathematics");
//            Course c2 = new Course("Physics");
//            Course c3 = new Course("Chemistry");
//            courseRepo.saveAll(Arrays.asList(c1, c2, c3));
//
//            // Associate students with courses using the helper method
//            associateStudentWithCourse(s1, c1);
//            associateStudentWithCourse(s2, c1);
//            associateStudentWithCourse(s2, c2);
//            associateStudentWithCourse(s3, c2);
//            associateStudentWithCourse(s1, c3);
//            associateStudentWithCourse(s3, c3);
//
//            // Save to persist associations
//            courseRepo.saveAll(Arrays.asList(c1, c2, c3));
//            studentRepo.saveAll(Arrays.asList(s1, s2, s3));
//
//            // Add some grades for students in courses
//            Grade g1 = new Grade(5.0, s1, c1);
//            Grade g2 = new Grade(6.0, s2, c1);
//            Grade g3 = new Grade(4.5, s2, c2);
//            Grade g4 = new Grade(5.5, s3, c2);
//            Grade g5 = new Grade(6.0, s1, c3);
//            Grade g6 = new Grade(5.0, s3, c3);
//            gradeRepo.saveAll(Arrays.asList(g1, g2, g3, g4, g5, g6));
//        };
//    }
//
//    /**
//     * Helper method to associate a student with a course.
//     * This ensures both sides of the many-to-many relationship are updated.
//     *
//     * @param student the student to be associated
//     * @param course the course to be associated
//     */
//    private void associateStudentWithCourse(Student student, Course course) {
//        // Update the course's students collection
//        course.getStudents().add(student);
//        // Update the student's courses collection
//        student.getCourses().add(course);
//    }
}
