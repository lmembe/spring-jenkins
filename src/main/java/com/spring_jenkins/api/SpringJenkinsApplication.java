package com.spring_jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	public void init() {
		logger.info("Application started...");
	}
	
	public static void main(String[] args) {
		logger.info("The Application has started executing...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
