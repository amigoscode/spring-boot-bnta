package com.amigoscode.car;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgres")
public class CarDataAccessService implements CarDAO {

    private JdbcTemplate jdbcTemplate;

    public CarDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Car selectCarById(Integer id) {
        return null;
    }

    @Override
    public List<Car> selectAllCars() {
        return List.of(
                new Car(1, "fobar", Brand.HONDA, 12000.00)
        );
    }

    @Override
    public int insertCar(Car car) {
        return 0;
    }

    @Override
    public int deleteCar(Integer id) {
        return 0;
    }

    @Override
    public int updateCar(Integer id, Car update) {
        return 0;
    }
}
