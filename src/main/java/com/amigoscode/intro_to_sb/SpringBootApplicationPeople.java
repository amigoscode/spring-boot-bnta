package com.amigoscode.intro_to_sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationPeople {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationPeople.class, args);
	}

	// All your code should be inside this one class
	// add @RestController to you expose methods as REST services to clients
	// create a static List of type person with few people inside
	// create a class called Person with following properties: id, name, age
	// implement getPersonById
	/*
		@GetMapping("people/{id}")
		public Person getPersonById(@PathVariable("id") Integer id) {
			// filter list and return person that matches id otherwise return null
		}
	 */
	// create another method that returns all people using @GetMapping("people")
	// test your api using chrome
}
