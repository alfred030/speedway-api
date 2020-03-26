package com.galvanize.services;

import com.galvanize.entites.Car;
import com.galvanize.repository.CarRepository;
import org.springframework.stereotype.Service;

import javax.management.RuntimeErrorException;
import java.util.List;
import java.util.Optional;

@Service
public class CarService{

    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public List<Car> findAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> findCarById(Long id) {
        if(carRepository.findById(id).isPresent()){
            return carRepository.findById(id);
        }else{
            throw new RuntimeException("Car id not found");
        }
    }

    public Car updateCarNickName(Long id, String newNickName) {
        if(carRepository.findById(id).isPresent()){
            Car car = carRepository.findById(id).get();
            car.setNickName(newNickName);
            return car;
        }else{
            throw new RuntimeException("Car id not found");
        }
    }

    public void deleteCarById(Long id) {
        if(carRepository.findById(id).isPresent()){
            carRepository.deleteById(id);
        }else{
            throw new RuntimeException("Car id not found");
        }

    }
}
