package com.example.repository;

import com.example.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository
    extends JpaRepository<Grade, Long>
//        extends JpaRepository<Grade, Long>
{

    List<Grade> findByCourseId(Long courseId);
    List<Grade> findByStudentIdAndCourseId(Long studentId, Long courseId);
    //    List<Grade> findByCourseId(Long courseId);
//    List<Grade> findByStudentIdAndCourseId(Long studentId, Long courseId);
}
