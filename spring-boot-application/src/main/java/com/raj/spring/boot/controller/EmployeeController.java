package com.raj.spring.boot.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.raj.spring.boot.model.Employee;
import com.raj.spring.boot.validation.ValidationError;
import com.raj.spring.boot.validation.ValidationErrorBuilder;

@RestController
public class EmployeeController {

	@PostMapping("/emp")
	public Employee employee(@Valid @RequestBody Employee employee) {
		
		System.out.println("Name : "+ employee.getName());
		System.out.println("Mobile : "+ employee.getMobile());
		
		return employee;
	}
	
	@ExceptionHandler
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ValidationError handleException(MethodArgumentNotValidException exception) {
        return createValidationError(exception);
    }

    private ValidationError createValidationError(MethodArgumentNotValidException exception) {
        return ValidationErrorBuilder.fromBindingErrors(exception.getBindingResult());
    }
}
