package com.jwt.car.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.car.app.domain.Car;
import com.jwt.car.app.repo.CarRepository;

@RestController
public class CarController {
	
	@Autowired
	private CarRepository carRepository;
	
	@RequestMapping("/cars")
	public Iterable<Car> getCars() {
		return carRepository.findAll();
	}

}
