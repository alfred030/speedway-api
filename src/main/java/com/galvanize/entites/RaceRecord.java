package com.galvanize.entites;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="race_record")
public class RaceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="driver")
    private Driver driver;

    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @Column(name="best_time")
    private String bestTime;

    @Column(name="top_speed")
    private Long topSpeed;

    public RaceRecord(){}

    public RaceRecord(Driver driver, Status status, String bestTime, Long topSpeed) {
        this.driver = driver;
        this.status = status;
        this.bestTime = bestTime;
        this.topSpeed = topSpeed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getBestTime() {
        return bestTime;
    }

    public void setBestTime(String bestTime) {
        this.bestTime = bestTime;
    }

    public Long getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Long topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "RaceRecord{" +
                "id=" + id +
                ", driver=" + driver +
                ", status=" + status +
                ", bestTime='" + bestTime + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
