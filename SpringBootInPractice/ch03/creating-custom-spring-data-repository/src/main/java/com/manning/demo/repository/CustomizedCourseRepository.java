package com.manning.demo.repository;

import com.manning.demo.model.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomizedCourseRepository extends BaseRepository<Course, Long>{
}
