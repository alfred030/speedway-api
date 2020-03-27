package com.galvanize.entites;

import com.galvanize.utilities.TimeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceRecordTest {

    private RaceRecord raceRecord;

    @Test
    public void createObjectWithDefaultConstructor(){
        raceRecord = new RaceRecord();
        assertNotNull(raceRecord);
    }

    @Test
    public void createObjectWithParameterConstructor(){
        raceRecord = new RaceRecord(new Driver(), Status.AVAILABLE,
                TimeHelper.getDurationBreakdown(10000),100L);
        assertNotNull(raceRecord);
        assertEquals(100L,raceRecord.getTopSpeed());
        assertEquals(Status.AVAILABLE,raceRecord.getStatus());
    }

}