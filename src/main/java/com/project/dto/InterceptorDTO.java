package com.project.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class InterceptorDTO {
	
	@Id
	private Integer id;

}
