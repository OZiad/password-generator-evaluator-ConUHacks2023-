package com.passwordgenerator.passgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@SpringBootApplication
public class PassgenApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassgenApplication.class, args);
	}
}
