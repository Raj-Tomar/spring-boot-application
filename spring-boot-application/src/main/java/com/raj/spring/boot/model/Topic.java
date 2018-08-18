package com.raj.spring.boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Topic {
	
	@Id
	@ApiModelProperty(notes = "Unique value for a Topic")
	private String id;
	
	@ApiModelProperty(notes = "Topic name")
	private String name;
	
	@ApiModelProperty(notes = "Description about the Topic")
	private String description;
	
}
