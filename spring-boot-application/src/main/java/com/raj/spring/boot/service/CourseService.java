package com.raj.spring.boot.service;

import java.util.List;

import com.raj.spring.boot.model.Course;

public interface CourseService {

	public List<Course> getAllCoursesByTopic(String topicId);
	
	public List<Course> getAllCoursesByTopicName(String topicName);

	public Course getCourse(String id);

	public void addCourse(Course course);

	public void updateCourse(Course course);

	public void deleteCourse(String id);

}
