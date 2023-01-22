package com.passwordgenerator.passgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PassgenApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassgenApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){
		return "Hello World";
	}
}