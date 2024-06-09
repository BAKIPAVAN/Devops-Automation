package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuildDeploymenyApplication {
	
	public static org.slf4j.Logger Logger=LoggerFactory.getLogger(BuildDeploymenyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BuildDeploymenyApplication.class, args);
		Logger.info("Started....................");
		System.out.println("Started.......");
	}

}
