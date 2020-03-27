package com.galvanize.services;

import com.galvanize.entites.Driver;
import com.galvanize.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {


    @Autowired
    DriverRepository driverRepository;


    public Driver save(Driver driver) {
        if(driver != null){
            return driverRepository.save(driver);
        }else{
            throw new RuntimeException("driver should not be null");
        }
    }
}
