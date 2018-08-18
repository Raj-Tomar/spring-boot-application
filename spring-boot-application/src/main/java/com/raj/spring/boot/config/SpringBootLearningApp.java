package com.raj.spring.boot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.raj.spring.boot")
@EntityScan("com.raj.spring.boot")
@EnableJpaRepositories("com.raj.spring.boot")
public class SpringBootLearningApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLearningApp.class, args);
	}

}
