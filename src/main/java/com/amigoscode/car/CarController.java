package com.amigoscode.car;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping(path = "cars")
    public void addCar(@RequestBody Car car) {
        carService.registerNewCar(car);
    }

    @GetMapping(path = "cars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    @DeleteMapping(path = "cars/{id}")
    public void deleteCarById(@PathVariable("id") Integer carId) {
        carService.deleteCarById(carId);
    }
}
