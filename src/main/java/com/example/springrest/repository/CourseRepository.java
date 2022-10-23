package com.example.springrest.repository;

import com.example.springrest.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
