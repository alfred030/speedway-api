package com.galvanize.entites;

import java.util.List;

public class Car {

    private Long id;
    private String nickName;
    private Model model;
    private String yea;
    private List<Driver> drivers;
    private Status status;
    private Long topSpeed;

    public Car(){}

    public Car(String nickName, Model model, String yea, List<Driver> drivers, Status status, Long topSpeed) {
        this.nickName = nickName;
        this.model = model;
        this.yea = yea;
        this.drivers = drivers;
        this.status = status;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", model=" + model +
                ", yea='" + yea + '\'' +
                ", drivers=" + drivers +
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

    public String getYea() {
        return yea;
    }

    public void setYea(String yea) {
        this.yea = yea;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

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
