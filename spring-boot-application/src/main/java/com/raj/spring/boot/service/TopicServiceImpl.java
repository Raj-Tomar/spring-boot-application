package com.raj.spring.boot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.spring.boot.model.Topic;
import com.raj.spring.boot.repository.TopicRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	// Dummy data for testing application without using database.
	@SuppressWarnings("unused")
	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(
					Topic.builder().id("1").name("Spring Boot").description("Spring Boot description").build(),
					Topic.builder().id("2").name("Spring Framework").description("Spring Framework description").build(),
					Topic.builder().id("3").name("Core Java").description("Core Java description").build()
					));

	@Override
	public List<Topic> getAllTopic() {
		//return topics;
		log.info("Getting all topics");
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	@Override
	public Topic getTopic(String id) {
		//return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
		log.info("Getting topic for id = {}", id);
		return topicRepository.findOne(id);
	}

	@Override
	public void addTopic(Topic topic) {
		//topics.add(topic);
		log.info("Adding topic details = {}", topic);
		topicRepository.save(topic);
	}

	@Override
	public void updateTopic(Topic topic) {
		/*topics.forEach(t -> {
			if(t.getId().equals(id)) {
				t.setName(topic.getName());
				t.setDescription(topic.getDescription());
			}
		});*/
		log.info("Updating topic = {} ", topic);
		topicRepository.save(topic);
	}

	@Override
	public void deleteTopic(String id) {
		//topics.removeIf(topic -> topic.getId().equals(id));
		log.info("Deleting topic id = {}", id);
		topicRepository.delete(id);
	}

}
