package com.galvanize.services;

import com.galvanize.entites.Car;
import com.galvanize.entites.Model;
import com.galvanize.entites.Status;
import com.galvanize.repository.CarRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class CarServiceTest {


    @Autowired
    CarService carService;


    @Autowired
    CarRepository carRepository;

    private Car car;


    @BeforeEach
    public void setup(){
        String nickName = "CarDriver";
        Model model = Model.Ferrari;
        String year = "2019";
        Status status = Status.AVAILABLE;
        Long topSpeed = 100L;
        car = new Car( nickName,  model,  year, status,topSpeed);
    }

    @Test
    public void saveCarTest() {

        Car actual = carService.save(car);
        assertEquals(car, actual);

    }

    @Test
    public void getAllCarsTest(){

        List<Car> expected = new ArrayList<>();
        expected.add(carService.save(car));
        List<Car> actual = carService.findAllCars();

        assertEquals(expected,actual);

    }

    @Test
    public void findCarByIdTest(){
        Car actual = carService.save(car);
        Car expected = carService.findCarById(actual.getId()).get();
        assertEquals(expected,actual);
    }

    @Test
    public void updateCarNickNameTest(){
        String newNickName = "UpdatedCarDriver";
        Car actual = carService.save(car);
        Car expected = carService.updateCarNickName(actual.getId(),newNickName);
        assertEquals(expected,actual);

    }

    @Test
    public void deleteCarByIdTest(){
        Car actual = carService.save(car);
        carService.deleteCarById(car.getId());
        assertThrows(RuntimeException.class, () -> carService.findCarById(actual.getId()).get());
    }


}