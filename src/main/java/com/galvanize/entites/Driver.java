package com.galvanize.entites;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="age")
    private int age;

    @Column(name="nick_name")
    private String nickName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Car car;

    @OneToMany
    @Column(name = "records")
    private List<RaceRecord> records;

    @Column(name="wins")
    private int wins;

    @Column(name="losses")
    private int losses;

    public Driver(){}

    public Driver(String firstName, String lastName, int age, String nickName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nickName = nickName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<RaceRecord> getRecords() {
        return records;
    }

    public void setRecords(List<RaceRecord> records) {
        this.records = records;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                ", car=" + car +
                ", records=" + records +
                ", wins=" + wins +
                ", losses=" + losses +
                '}';
    }
}
