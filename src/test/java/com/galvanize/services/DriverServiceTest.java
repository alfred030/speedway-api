package com.galvanize.services;

import com.galvanize.entites.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
@AutoConfigureMockMvc
public class DriverServiceTest {
    @Autowired
    DriverService driverService;

    private Driver driver;

    @BeforeEach
    public void setup() {
        //Setup
        String firstName = "name";
        String lastName = "name2";
        String nickName = "nickName";
        driver = new Driver(firstName, lastName, Date.valueOf(LocalDate.of(1990,11,16)), nickName);
    }

    @Test
    public void saveDriverTest() {
        //Exercise
        Driver actual = driverService.save(driver);
        //Assert
        assertEquals(driver.getAge(), actual.getAge());
        assertEquals(driver.getNickName(), actual.getNickName());
        //Teardown
    }

}
