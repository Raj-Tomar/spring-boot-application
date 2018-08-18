package com.raj.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.spring.boot.model.Course;
import com.raj.spring.boot.repository.CourseRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Course> getAllCoursesByTopic(String topicId) {
		log.info("Getting all courses");
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	@Override
	public List<Course> getAllCoursesByTopicName(String topicName) {
		log.info("Getting all topics");
		List<Course> courses = new ArrayList<>();
		courseRepository.findByName(topicName).forEach(courses::add);
		return courses;
	}

	@Override
	public Course getCourse(String id) {
		log.info("Getting course for id = {}", id);
		return courseRepository.findOne(id);
	}

	@Override
	public void addCourse(Course course) {
		log.info("Adding Course details = {}", course);
		courseRepository.save(course);
	}

	@Override
	public void updateCourse(Course course) {
		log.info("Updating course = {} ", course);
		courseRepository.save(course);
	}

	@Override
	public void deleteCourse(String id) {
		log.info("Deleting Course id = {}", id);
		courseRepository.delete(id);
	}

}
