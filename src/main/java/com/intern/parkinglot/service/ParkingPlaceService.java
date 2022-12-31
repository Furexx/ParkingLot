package com.intern.parkinglot.service;

import com.intern.parkinglot.model.ParkingPlace;

import java.util.List;

public interface ParkingPlaceService {
    void insert(ParkingPlace parkingPlace);
    void update(ParkingPlace parkingPlace);
    void delete(Integer id);
    ParkingPlace show(Integer id);
    List<ParkingPlace> list();
    String showCar(Integer parkingPlaceId);

}
