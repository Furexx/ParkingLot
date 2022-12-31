package com.intern.parkinglot.repository;

import com.intern.parkinglot.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

    Car findByParkingPlaceId(Integer parkingPlaceId);
}
