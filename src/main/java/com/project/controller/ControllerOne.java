package com.project.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.modal.AccessTokenModel;

@RestController
@RequestMapping(value = "/controller1")
public class ControllerOne {
	
	@GetMapping("/response")
	public String getResponse(@RequestHeader("accesstoken") String accessToken) throws JsonMappingException, JsonProcessingException {

		return "Success";
	}
}
