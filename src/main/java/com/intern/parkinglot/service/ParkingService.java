package com.intern.parkinglot.service;

import com.intern.parkinglot.model.Parking;
import com.intern.parkinglot.model.ParkingZone;

import java.util.List;

public interface ParkingService {
    void insert(Parking parking);
    void update(Parking parking);
    void delete(Integer id);
    Parking show(Integer id);
    List<Parking> list();
    List<String> showZones(Integer parkingId);

}
