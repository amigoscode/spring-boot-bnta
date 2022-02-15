package com.amigoscode.car;

import java.util.Objects;

public class Car {

    private Integer id;
    private String regNumber;
    private Brand brand;
    private Double price;

    public Car(Integer id, String regNumber, Brand brand, Double price) {
        this.id = id;
        this.regNumber = regNumber;
        this.brand = brand;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", regNumber='" + regNumber + '\'' +
                ", brand=" + brand +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(regNumber, car.regNumber) && brand == car.brand && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, regNumber, brand, price);
    }
}
