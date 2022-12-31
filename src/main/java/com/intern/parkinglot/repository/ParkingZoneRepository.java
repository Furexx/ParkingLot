package com.intern.parkinglot.repository;

import com.intern.parkinglot.model.ParkingZone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParkingZoneRepository extends JpaRepository<ParkingZone, Integer> {

    List<ParkingZone> findByParkingId(Integer parkingId);


}
