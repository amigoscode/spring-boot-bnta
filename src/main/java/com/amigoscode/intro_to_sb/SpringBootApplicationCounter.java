package com.amigoscode.intro_to_sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootApplicationCounter {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationCounter.class, args);
	}

	// All your code should be inside this one class
	// add @RestController to you expose methods as REST services to clients
	// create a variable static int count = 0;

	// All methods should have a @GetMapping
	// Create a method to get current count. i.e localhost:8080/current-count
	// Create method to increment the count. i.e localhost:8080/increment-count
	// Create method to decrement the count. i.e localhost:8080/decrement-count
	// Test your api with chrome
}
