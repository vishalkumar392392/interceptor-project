package com.project.interceptor;

import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.controller.ControllerOne;
import com.project.modal.AccessTokenModel;
import com.project.repository.InterceptorRepository;

@SuppressWarnings("deprecation")
@Component
public class Log1Interceptor extends HandlerInterceptorAdapter {

	@Autowired
	private InterceptorRepository repository;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String root = ControllerOne.API.ROOT + ControllerOne.API.AUTH;
		
		if(root.equalsIgnoreCase(request.getRequestURI())) {
			return true;
		}
		System.out.println(root);
		System.out.println(request.getRequestURI());
		byte[] decodedBytes = Base64.getDecoder().decode(request.getHeader("accesstoken"));
		String decodedString = new String(decodedBytes);
		AccessTokenModel model = objectMapper.readValue(decodedString, AccessTokenModel.class);
		
//		System.out.println(repository.getCustomerByEmail(model.getEmail()));
		System.out.println(repository.findByEmail(model.getEmail()));

		return true;
	}

}
