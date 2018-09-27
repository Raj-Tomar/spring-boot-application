package com.raj.spring.boot.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Size(min=3, message="Invalid Name")
	private String name;
	
	@NotNull
	@Size(min=10, message="Mobile should have 10 numbers")
	private String mobile;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
