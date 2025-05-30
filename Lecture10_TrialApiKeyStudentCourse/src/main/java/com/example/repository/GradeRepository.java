package com.example.repository;

import com.example.model.Grade;
import com.example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {

    List<Grade> findByCourseId(Long id);

    List<Grade> findByCourseIdAndStudentId(Long courseId, Long studentId);


}
