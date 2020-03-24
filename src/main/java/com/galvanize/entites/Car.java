package com.galvanize.entites;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nick_name")
    private String nickName;
    @Column(name = "model")
    private Model model;
    @Column(name = "year")
    private String year;
//    @Column(name = "drivers")
//    private List<Driver> drivers;
    @Column(name = "status")
    private Status status;
    @Column(name = "topSpeed")
    private Long topSpeed;


    public Car(){}

    public Car(String nickName, Model model, String year, List<Driver> drivers, Status status, Long topSpeed) {
        this.nickName = nickName;
        this.model = model;
        this.year = year;
        //this.drivers = drivers;
        this.status = status;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", model=" + model +
                ", yea='" + year + '\'' +
                //", drivers=" + drivers +
                ", status=" + status +
                ", topSpeed=" + topSpeed +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String yea) {
        this.year = yea;
    }

//    public List<Driver> getDrivers() {
//        return drivers;
//    }
//
//    public void setDrivers(List<Driver> drivers) {
//        this.drivers = drivers;
//    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Long topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Double convertToKilometerPerHour() {
        return topSpeed * 1.60934;
    }
}
