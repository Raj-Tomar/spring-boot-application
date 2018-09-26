package com.raj.spring.boot.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raj.spring.boot.model.Employee;

@RestController
public class EmployeeController {

	@PostMapping("/emp")
	public ResponseEntity<Object> addCourse(@Valid @RequestBody Employee employee) {
		
		System.out.println("Name : "+ employee.getName());
		System.out.println("Mobile : "+ employee.getMobile());
		
		return new ResponseEntity<Object>(employee, HttpStatus.BAD_REQUEST);
	}
}
