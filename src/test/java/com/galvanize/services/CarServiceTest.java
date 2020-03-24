package com.galvanize.services;

import com.galvanize.entites.Car;
import com.galvanize.entites.Driver;
import com.galvanize.entites.Model;
import com.galvanize.entites.Status;
import com.galvanize.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class CarServiceTest {


    @Autowired
    CarService carService;


    @Autowired
    CarRepository carRepository;


    @Test
    public void saveCarTest() {
        //Setup
        String nickName = "CarDriver";
        Model model = Model.Ferrari;
        String year = "2019";
        List<Driver> drivers = new ArrayList<>();
        Status status = Status.AVAILABLE;
        Long topSpeed = 100L;
        Car expected = new Car( nickName,  model,  year, drivers, status,topSpeed);
        //Exercise
        Car actual = carService.save(expected);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

}