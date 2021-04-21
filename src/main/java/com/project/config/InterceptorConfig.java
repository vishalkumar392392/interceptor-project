package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.project.interceptor.Log1Interceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

	@Bean
	public Log1Interceptor pagePopulationInterceptor() {
	    return new Log1Interceptor();
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

	registry.addInterceptor( pagePopulationInterceptor());
	}

}
