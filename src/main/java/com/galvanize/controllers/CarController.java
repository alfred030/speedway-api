package com.galvanize.controllers;

import com.galvanize.entites.Car;
import com.galvanize.responses.Response;
import com.galvanize.services.CarService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {

    CarService carService;
    Response response;

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
    public Response postCar(@RequestBody Car car){
        car = carService.save(car);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "foo");
        Response response = new Response(car , headers, HttpStatus.OK);
        return response;

    }


    //READ

    @GetMapping("/cars")
    public Response getAllCars(){
        List<Car> cars = carService.findAllCars();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "foo");
        Response response = new Response(cars , headers, HttpStatus.OK);
        return response;
    }

    @GetMapping("/cars/{id}")
    public Response getAllOrderById(@PathVariable long id){
        Car car = carService.findCarById(id);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "foo");
        Response response = new Response(car , headers, HttpStatus.OK);
        return response;
    }


    //UPDATE


    @PutMapping("/cars/{id}")
    public Response updateCarById(@PathVariable long id, @RequestBody Car car){
        car = carService.updateCarById(id, car);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "foo");
        Response response = new Response(car , headers, HttpStatus.OK);
        return response;
    }


    //DELETE


    @DeleteMapping("/cars/{id}")
    public void deleteCarById( @PathVariable Long id){
        carService.deleteCarById(id);
    }
}
