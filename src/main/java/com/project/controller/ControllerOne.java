package com.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping(value = ControllerOne.API.ROOT)
public class ControllerOne {
	
	@NoArgsConstructor(access = AccessLevel.PRIVATE)
	public class API{
		
		public static final String ROOT = "/controller1"; 
		
		public static final String AUTH = "/auth";
		
		public static final String RESPONSE = "/response";
		
	}
	@GetMapping(API.RESPONSE)
	public String getResponse(){

		return "Success";
	}
}
