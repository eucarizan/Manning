package com.manning.demo;

import com.manning.demo.model.Course;
import com.manning.demo.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private CourseRepository courseRepository;

	@Test
	public void givenCreateCourseWhenLoadTheCoursesThenExpectSameCourses() {
		Course course = new Course("Rapid Spring Boot Application Development", "Spring", 4, "`Spring Boot gives all the power of the Spring Framework without all of the complexities");
		Course savedCourse = courseRepository.save(course);
		assertThat(courseRepository.findById(savedCourse.getId()).get()).isEqualTo(course);
	}

	@Test
	public void givenUpdateCourseWhenLoadTheCourseThenExpectUpdatedCourse() {
		Course course = new Course("Rapid Spring Boot Application Development", "Spring", 4, "`Spring Boot gives all the power of the Spring Framework without all of the complexities");
		courseRepository.save(course);
		course.setRating(5);
		Course savedCourse = courseRepository.save(course);
		assertThat(courseRepository.findById(savedCourse.getId()).get().getRating()).isEqualTo(5);
	}

	@Test
	public void givenDeleteCourseWhenLoadTheCourseThenExpectNoCourse() {
		Course course = new Course("Rapid Spring Boot Application Development", "Spring", 4, "`Spring Boot gives all the power of the Spring Framework without all of the complexities");
		Course savedCourse = courseRepository.save(course);
		assertThat(courseRepository.findById(savedCourse.getId()).get()).isEqualTo(course);
		courseRepository.delete(course);
		assertThat(courseRepository.findById(savedCourse.getId()).isPresent()).isFalse();
	}

}
