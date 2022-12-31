package com.intern.parkinglot.service;

import com.intern.parkinglot.model.Car;

import java.util.List;

public interface CarService {
    void insert(Car car);
    void update(Car car);
    void delete(Integer id);
    Car show(Integer id);
    List<Car> list();
    String showParking(Integer id);
    String showZone(Integer id);
    int showPlace(Integer id);
}
