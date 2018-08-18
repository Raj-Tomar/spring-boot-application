package com.raj.spring.boot.service;

import java.util.List;

import com.raj.spring.boot.model.Topic;

public interface TopicService {

	public List<Topic> getAllTopic();

	public Topic getTopic(String id);

	public void addTopic(Topic topic);

	public void updateTopic(Topic topic);

	public void deleteTopic(String id);

}
