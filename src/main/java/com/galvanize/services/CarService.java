package com.galvanize.services;

import com.galvanize.entites.Car;
import com.galvanize.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarService{
    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }
}
