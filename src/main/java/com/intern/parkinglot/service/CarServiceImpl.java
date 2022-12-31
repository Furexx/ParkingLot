package com.intern.parkinglot.service;

import com.intern.parkinglot.model.Car;
import com.intern.parkinglot.model.ParkingPlace;
import com.intern.parkinglot.model.ParkingZone;
import com.intern.parkinglot.repository.CarRepository;
import com.intern.parkinglot.repository.ParkingPlaceRepository;
import com.intern.parkinglot.repository.ParkingZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private ParkingZoneRepository parkingZoneRepository;
    @Autowired
    private ParkingPlaceRepository parkingPlaceRepository;

    @Override
    public void insert(Car car) {
        carRepository.save(car);
    }

    @Override
    public void update(Car car) {
        carRepository.save(car);
    }

    @Override
    public void delete(Integer id) {
        carRepository.deleteById(id);
    }

    @Override
    public Car show(Integer id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public List<Car> list() {
        return carRepository.findAll();
    }

    @Override
    public String showParking(Integer id) {
        Car car = carRepository.findById(id).orElse(null);
        if (car == null){
            return null;
        }
        ParkingPlace parkingPlace = parkingPlaceRepository.findById(car.getParkingPlace().getId()).orElse(null);
        if (parkingPlace == null) {
            return null;
        }
        ParkingZone zone = parkingZoneRepository.findById(parkingPlace.getZone().getId()).orElse(null);
        if (zone == null) {
            return null;
        }
        return zone.getParking().getName();
    }


    @Override
    public String showZone(Integer id) {
        Car car = carRepository.findById(id).orElse(null);
        if (car == null) {
            return null;
        }
        ParkingPlace parkingPlace = parkingPlaceRepository.findById(car.getParkingPlace().getId()).orElse(null);
        if (parkingPlace == null){
            return null;
        }
        return parkingPlace.getZone().getName();
    }

    @Override
    public int showPlace(Integer id) {
        Car car = carRepository.findById(id).orElse(null);
        if (car == null) {
            return 0;
        }
        return car.getParkingPlace().getNumber();
    }
}
