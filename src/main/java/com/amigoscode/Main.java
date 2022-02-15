package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        CarDAO carDAO = new FakeCarDataAccessService();
//        CarService carService = new CarService(carDAO);
//        CarController carController = new CarController(carService);
        SpringApplication.run(Main.class, args);
    }

//    @Bean("fake")
//    public CarDAO fakeDataAccessService() {
//        return new FakeCarDataAccessService();
//    }
}
