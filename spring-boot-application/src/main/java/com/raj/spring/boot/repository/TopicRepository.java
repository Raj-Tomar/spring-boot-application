package com.raj.spring.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.raj.spring.boot.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
