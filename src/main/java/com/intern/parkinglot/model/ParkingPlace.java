package com.intern.parkinglot.model;

import jakarta.persistence.*;
@Entity
public class ParkingPlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int number;
    @ManyToOne
    @JoinColumn(name = "zone_id")
    private ParkingZone zone;
    @OneToOne
    private Car car;

    public ParkingPlace() {
    }

    public ParkingPlace( int number, ParkingZone zone) {
        this.number = number;
        this.zone = zone;
    }

    public ParkingPlace( int number, ParkingZone zone, Car car) {
        this.number = number;
        this.zone = zone;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ParkingZone getZone() {
        return zone;
    }

    public void setZone(ParkingZone zone) {
        this.zone = zone;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
