package com.amigoscode.car;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
        // todo: implement this method to get car by id from database
        return null;
    }

    @Override
    public List<Car> selectAllCars() {
        String sql = """
                SELECT id, regnumber, brand, price
                FROM car
                """;

        RowMapper<Car> carRowMapper = (rs, rowNum) -> {
            Car car = new Car(
                    rs.getInt("id"),
                    rs.getString("regnumber"),
                    Brand.valueOf(rs.getString("brand")),
                    rs.getDouble("price")
            );
            return car;
        };

        List<Car> cars = jdbcTemplate.query(sql, carRowMapper);

        /*
            List<Car> cars = jdbcTemplate.query(sql, (rs, rowNum) -> {
                Car car = new Car(
                        rs.getInt("id"),
                        rs.getString("regnumber"),
                        Brand.valueOf(rs.getString("brand")),
                        rs.getDouble("price")
                );
                return car;
            });
        */

        return cars;
    }

    @Override
    public int insertCar(Car car) {
        String sql = """
                INSERT INTO car(regnumber, brand, price)
                VALUES(?, ?, ?)
                """;
        int rowsAffected = jdbcTemplate.update(
                sql,
                car.getRegNumber(),
                car.getBrand().name(),
                car.getPrice()
        );
        return rowsAffected;
    }

    @Override
    public int deleteCar(Integer id) {
        String sql = "DELETE FROM car WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int updateCar(Integer id, Car update) {
        return 0;
    }
}
