package com.galvanize.entites;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void createCarTest(){
        String nickName = "CarDriver";
        Model model = Model.Ferrari;
        String year = "2019";
        List<Driver> drivers = new ArrayList<>();
        Status status = Status.AVAILABLE;
        Long topSpeed = 100L;
        Car  car = new Car( nickName,  model,  year, drivers, status,topSpeed);
        assertEquals(car.getNickName(),"CarDriver");
        assertEquals(car.getStatus(), Status.AVAILABLE);
        assertEquals(car.getDrivers().size(),0);
    }

}