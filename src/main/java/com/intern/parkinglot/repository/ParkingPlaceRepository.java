package com.intern.parkinglot.repository;

import com.intern.parkinglot.model.ParkingPlace;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParkingPlaceRepository extends JpaRepository<ParkingPlace, Integer> {

    List<ParkingPlace> findByZoneId(Integer id);
}
