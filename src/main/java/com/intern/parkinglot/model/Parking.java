package com.intern.parkinglot.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "parking")
    @Column(name = "parking_zones")
    private List<ParkingZone> zones;
    private String city;
    private String street;
    private int zipCode;



    public Parking(String name, List<ParkingZone> zones, String city, String street, int zipCode) {
        this.name = name;
        this.zones = zones;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    public Parking() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingZone> getZones() {
        return zones;
    }

    public void setZones(List<ParkingZone> zones) {
        this.zones = zones;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

}
