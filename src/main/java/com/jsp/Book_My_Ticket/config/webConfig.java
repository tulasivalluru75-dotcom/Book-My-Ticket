package com.jsp.Book_My_Ticket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webConfig implements WebMvcConfigurer{
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		String path = System.getProperty("user.dir")+ "/uploads/";
		registry.addResourceHandler("/uploads/**").addResourceLocations("file:" + path);
	}
}
