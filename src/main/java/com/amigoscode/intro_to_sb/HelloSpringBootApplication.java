package com.amigoscode.intro_to_sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@RestController
public class HelloSpringBootApplication {

	// localhost:8080
	@GetMapping
	String greet() {
		return "Hello Shirhan";
	}

	@GetMapping(params = "name")
	String greetName(@RequestParam("name") String name) {
		return "Hello " + name + " how are you today?";
	}

	// localhost:8080/ping
	@GetMapping(path = "ping")
	String ping() {
		return "pong";
	}

	// localhost:8080/foo
	@GetMapping(path = "foo")
	String foo() {
		return "bar";
	}

	@GetMapping(path = "people")
	List<Person> getPerson() {
		return List.of(
				new Person("Alex", 24, true, List.of("burgers", "chips"), List.of()),
				new Person("Wendy", 15, false, List.of(), List.of(new Car("Tesla"), new Car("Ford")))
		);
	}

	@PostMapping(path = "people")
	void addPerson(@Valid @RequestBody Person person) {
		System.out.println(person);
	}

	record CarRecord(String brand) {}

	static class Car {
		@NotBlank
		private String brand;

		Car(String brand) {
			this.brand = brand;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		@Override
		public String toString() {
			return "Car{" +
					"brand='" + brand + '\'' +
					'}';
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Car car = (Car) o;
			return Objects.equals(brand, car.brand);
		}

		@Override
		public int hashCode() {
			return Objects.hash(brand);
		}
	}

	static class Person {
		private String name;
		@Max(value = 120, message = "sorry age cannot be greater than 120")
		@Min(value = 0)
		private Integer age;
		@NotNull
		private Boolean isAdult;
		private List<String> favouriteFood;
		private List<Car> cars;

		Person(String name, Integer age, Boolean isAdult, List<String> favouriteFood, List<Car> cars) {
			this.name = name;
			this.age = age;
			this.isAdult = isAdult;
			this.favouriteFood = favouriteFood;
			this.cars = cars;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}


		public List<String> getFavouriteFood() {
			return favouriteFood;
		}

		public void setFavouriteFood(List<String> favouriteFood) {
			this.favouriteFood = favouriteFood;
		}

		public Boolean getAdult() {
			return isAdult;
		}

		public void setAdult(Boolean adult) {
			isAdult = adult;
		}

		public List<Car> getCars() {
			return cars;
		}

		public void setCars(List<Car> cars) {
			this.cars = cars;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", age=" + age +
					", isAdult=" + isAdult +
					", favouriteFood=" + favouriteFood +
					", cars=" + cars +
					'}';
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Person person = (Person) o;
			return Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(isAdult, person.isAdult) && Objects.equals(favouriteFood, person.favouriteFood) && Objects.equals(cars, person.cars);
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, age, isAdult, favouriteFood, cars);
		}
	}

}
