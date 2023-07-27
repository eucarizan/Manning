package com.manning.demo.repository;

import com.manning.demo.ibp.DescriptionOnly;
import com.manning.demo.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

    // Methods to be added

    Iterable<DescriptionOnly> getCourseByName(String name);
}