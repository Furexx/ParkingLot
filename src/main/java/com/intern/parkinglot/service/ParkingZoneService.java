package com.intern.parkinglot.service;

import com.intern.parkinglot.model.ParkingZone;

import java.util.List;

public interface ParkingZoneService {
    void insert(ParkingZone zone);
    void update(ParkingZone zone);
    void delete(Integer id);
    ParkingZone show(Integer id);
    List<ParkingZone> list();
    List<Integer> showPlaces(Integer id);
}
