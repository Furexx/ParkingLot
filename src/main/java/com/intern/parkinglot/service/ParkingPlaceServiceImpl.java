package com.intern.parkinglot.service;

import com.intern.parkinglot.model.ParkingPlace;
import com.intern.parkinglot.repository.CarRepository;
import com.intern.parkinglot.repository.ParkingPlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingPlaceServiceImpl implements ParkingPlaceService{
    @Autowired
    private ParkingPlaceRepository placeRepository;
    @Autowired
    private CarRepository carRepository;

    @Override
    public void insert(ParkingPlace parkingPlace) {
        placeRepository.save(parkingPlace);
    }

    @Override
    public void update(ParkingPlace parkingPlace) {
        placeRepository.save(parkingPlace);
    }

    @Override
    public void delete(Integer id) {
        placeRepository.deleteById(id);
    }

    @Override
    public ParkingPlace show(Integer id) {
        ParkingPlace place = placeRepository.findById(id).get();
        return place;
    }

    @Override
    public List<ParkingPlace> list() {
        return placeRepository.findAll();
    }

    @Override
    public String showCar(Integer parkingPlaceId) {
        return carRepository.findByParkingPlaceId(parkingPlaceId).getPlateNumber();
    }
}
