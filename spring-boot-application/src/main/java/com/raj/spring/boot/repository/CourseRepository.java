package com.raj.spring.boot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.raj.spring.boot.model.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByTopicId(String topicId);
	
	public List<Course> findByName(String topicName);
	
}
