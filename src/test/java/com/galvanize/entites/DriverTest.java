package com.galvanize.entites;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.sql.Date;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class DriverTest {

    Driver driver;

    @Test
    public void getDriverObjectWithDefaultConstructorTest(){
        driver = new Driver();
        assertNotNull(driver);
    }

    @Test
    public void getDriverObjectWithParameterConstructorTest(){
        driver = new Driver("Alex",
                "Krishna", Date.valueOf(LocalDate.of(1990, 11, 16)),
                "AK");
        assertNotNull(driver);
        assertEquals("AK", driver.getNickName());
    }

}