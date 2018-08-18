package com.raj.spring.boot.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public static final Contact DEFAULT_CONTACT = 
			new Contact("Raj Tomar", "https://github.com/Raj-Tomar", "rajtomar50@gmail.com");

	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>(
			Arrays.asList("application/json"));

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Spring Boot App")
				.select()
				.apis(RequestHandlerSelectors.any())
				//.apis(RequestHandlerSelectors.basePackage("com.raj.spring.boot"))
				// .paths(PathSelectors.any())
				//.paths(PathSelectors.ant("/**"))
				.paths(paths())
				.build()
				.apiInfo(apiInfo())
				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	}

	private ApiInfo apiInfo() {
		return new ApiInfo(
				"Spring Boot Learning REST API", // API Title
				"This API is developed only learning purpose and to get familiar Spring Boot and Spring Swagger", // API Description
				"API TOS", 
				"Terms of service", 
				DEFAULT_CONTACT, 
				"License of API", 
				"API license URL",
				Collections.emptyList());
	}
	
	
	//Paths to exposed APIs
	@SuppressWarnings("unchecked")
	private Predicate<String> paths() {
		return Predicates.or(
				PathSelectors.ant("/topics/**")
				);
	}
}
