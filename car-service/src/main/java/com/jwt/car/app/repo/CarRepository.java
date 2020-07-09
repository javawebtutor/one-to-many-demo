package com.jwt.car.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.jwt.car.app.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

	// fetch car by brand
	List<Car> findByBrand(@Param("brand") String brand);

	//fetch car by color
	List<Car> findByColor(@Param("color") String color);

}