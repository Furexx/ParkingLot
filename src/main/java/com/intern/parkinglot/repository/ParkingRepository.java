package com.intern.parkinglot.repository;

import com.intern.parkinglot.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, Integer> {
}
