package com.intern.parkinglot.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ParkingZone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "parking")
    private Parking parking;

    @OneToMany(mappedBy = "zone")
    private List<ParkingPlace> places;

    public ParkingZone( String name, Parking parking,List<ParkingPlace> places) {
        this.name = name;
        this.parking = parking;
        this.places = places;
    }

    public ParkingZone() {

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

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    public List<ParkingPlace> getPlaces() {
        return places;
    }

    public void setPlaces(List<ParkingPlace> places) {
        this.places = places;
    }
}
