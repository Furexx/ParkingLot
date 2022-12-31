package com.intern.parkinglot.service;

import com.intern.parkinglot.model.ParkingPlace;
import com.intern.parkinglot.model.ParkingZone;
import com.intern.parkinglot.repository.ParkingPlaceRepository;
import com.intern.parkinglot.repository.ParkingZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingZoneServiceImpl implements ParkingZoneService{
    @Autowired
    private ParkingZoneRepository zoneRepository;
    @Autowired
    private ParkingPlaceRepository placeRepository;

    @Override
    public void insert(ParkingZone zone) {
        zoneRepository.save(zone);
    }

    @Override
    public void update(ParkingZone zone) {
        zoneRepository.save(zone);
    }

    @Override
    public void delete(Integer id) {
        zoneRepository.deleteById(id);
    }

    @Override
    public ParkingZone show(Integer id) {
        return zoneRepository.findById(id).orElse(null);
    }

    @Override
    public List<ParkingZone> list() {
        return zoneRepository.findAll();
    }

    @Override
    public List<Integer> showPlaces(Integer id) {
        List<ParkingPlace> places = zoneRepository.findById(id).get().getPlaces();
        return places.stream().map(ParkingPlace::getNumber).collect(Collectors.toList());
    }
}
