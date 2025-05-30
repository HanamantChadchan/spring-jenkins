package com.jenkinsdemo;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsdemoApplication {
 
	public static Logger logger= LoggerFactory.getLogger(JenkinsdemoApplication.class);
	 
	 @PostConstruct
	 public void intt() {
		 logger.info("Application started....");
	 }
	public static void main(String[] args) {
		 logger.info("Application executed....");
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}

}
