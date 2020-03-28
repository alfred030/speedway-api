package com.galvanize.controllers;

import com.galvanize.entites.Car;
import com.galvanize.services.CarService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {

    CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam(required=false, defaultValue = "World") String name) {
        if (name.equals("")){
            name = "World";
        }
        return String.format("Hello %s from my first Spring Boot Application!", name);
    }


    // CREATE


    @PostMapping(value = "/cars", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Car postCar(@RequestBody Car car){
        return carService.save(car);
    }


    //READ

    @GetMapping("/cars")
    public List<Car> getAllCars(){
        return carService.findAllCars();
    }

    @GetMapping("/cars/{id}")
    public Car getAllOrderById(@PathVariable long id){
        return carService.findCarById(id);
    }


    //UPDATE


    @PutMapping("/cars/{id}")
    public Car updateCarById(@PathVariable long id, @RequestBody Car car){
        return carService.updateCarById(id, car);
    }


    //DELETE


    @DeleteMapping("/cars/{id}")
    public void deleteCarById( @PathVariable Long id){
        carService.deleteCarById(id);
    }
}
