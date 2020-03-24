package com.galvanize.entites;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    public void setup(){
        String nickName = "CarDriver";
        Model model = Model.Ferrari;
        String year = "2019";
        List<Driver> drivers = new ArrayList<>();
        Status status = Status.AVAILABLE;
        Long topSpeed = 100L;
        car = new Car( nickName,  model,  year, drivers, status,topSpeed);
    }

    @Test
    public void createCarTest(){
        assertEquals(car.getNickName(),"CarDriver");
        assertEquals(car.getStatus(), Status.AVAILABLE);
        assertEquals(car.getDrivers().size(),0);
    }

    @Test
    public void convertMilePerHourTest(){
       Double expected = 160.934;
       Double actual = car.convertToKilometerPerHour();
       assertEquals(actual,expected);
    }

}