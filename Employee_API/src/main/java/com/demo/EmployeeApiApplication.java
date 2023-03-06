package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(

		info = @Info(title = "Employee API Backend Springboot 3", version = "Employee API v.0.0.1", 
		description = "This is a Spring boot project for Employee API ", 
		termsOfService = "A Springboot conifg", 
		contact = @Contact(name = "Ashfaq", email = "ash001x@gmail.com"

		), license = @License(name = "license", url = "domain/swagger-ui/index.html"

		)

		))
public class EmployeeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApiApplication.class, args);
	}

}
