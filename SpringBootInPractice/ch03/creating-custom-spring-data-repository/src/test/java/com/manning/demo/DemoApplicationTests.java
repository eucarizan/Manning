package com.manning.demo;

import com.manning.demo.model.Course;
import com.manning.demo.repository.CustomizedCourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class DemoApplicationTests {

	@Autowired
	private CustomizedCourseRepository customizedCourseRepository;

	@Test
	void givenCreateCourseWhenFindAllCoursesThenExpectOneCourse() {
		Course course = new Course("Rapid Spring Boot Application Development", "Sring", 4, "'Spring Boot gives all the power of the Spring Framework without all of the complexities");
		customizedCourseRepository.save(course);
		assertThat(Arrays.asList(customizedCourseRepository.findAll()).size()).isEqualTo(1);
	}

}
