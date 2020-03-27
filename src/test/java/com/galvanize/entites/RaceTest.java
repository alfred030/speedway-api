package com.galvanize.entites;

import com.galvanize.utilities.TimeHelper;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class RaceTest {

    private Race race;

    @Test
    public void createRaceObjectWithDefaultConstructor(){
        race = new Race();
        assertNotNull(race);
    }

    @Test
    public void createRaceObjectWithParameterConstructor(){

        race = new Race("Grand Prix III", RaceCategory.SPORT_CAR,
                Date.valueOf(LocalDate.of(2020, 03, 27)),
                        TimeHelper.getDurationBreakdown(100000), new Driver());
        assertNotNull(race);
        assertEquals("Grand Prix III", race.getName());
    }

}