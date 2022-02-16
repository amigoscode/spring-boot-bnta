package com.amigoscode;

import com.amigoscode.car.CarController;
import com.amigoscode.car.CarDAO;
import com.amigoscode.car.CarService;
import com.amigoscode.car.FakeCarDataAccessService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        CarDAO carDAO = new FakeCarDataAccessService();
//        CarService carService = new CarService(carDAO);
//        CarController carController = new CarController(carService);
        SpringApplication.run(Main.class, args);
    }

//    @Bean
//    public CarDAO fakeDataAccessService() {
//        return new FakeCarDataAccessService();
//    }
//
//    @Bean
//    public CarService fakeDataAccessService(CarDAO carDAO) {
//        return new CarService(carDAO);
//    }
}
