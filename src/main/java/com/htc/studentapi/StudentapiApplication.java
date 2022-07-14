package com.htc.studentapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class StudentapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentapiApplication.class, args);
		new StudentapiApplication();
	}

}
