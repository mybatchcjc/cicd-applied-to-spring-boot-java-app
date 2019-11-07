package com.cicd.cicdappliedtospringbootjavaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdAppliedToSpringBootJavaAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CicdAppliedToSpringBootJavaAppApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "Hello World form Sai";
	}

}
