package com.intern.parkinglot.service;

import com.intern.parkinglot.model.Parking;
import com.intern.parkinglot.model.ParkingZone;
import com.intern.parkinglot.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingServiceImpl implements ParkingService{
    @Autowired
    private ParkingRepository parkingRepository;


    @Override
    public void insert(Parking parking) {
        parkingRepository.save(parking);
    }

    @Override
    public void update(Parking parking) {
        parkingRepository.save(parking);
    }

    @Override
    public void delete(Integer id) {
        parkingRepository.deleteById(id);
    }

    @Override
    public Parking show(Integer id) {
        return parkingRepository.findById(id).orElse(null);
    }

    @Override
    public List<Parking> list() {
        return parkingRepository.findAll();
    }

    @Override
    public List<String> showZones(Integer parkingId) {
        List<ParkingZone> zones = parkingRepository.findById(parkingId).get().getZones();
        return zones.stream().map(ParkingZone::getName).collect(Collectors.toList());
    }
}
