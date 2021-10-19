package com.thenetvalue.sbTutorial1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class sbTutorial1Application {

	@CrossOrigin(origins = "http://localhost:4200/**")
	public static void main(String[] args) {
		SpringApplication.run(sbTutorial1Application.class, args);
	}

}
