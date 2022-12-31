package com.intern.parkinglot.controller;

import com.intern.parkinglot.model.Car;
import com.intern.parkinglot.service.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    CarServiceImpl carService;

    @PostMapping("/add")
    public void insert(@RequestBody Car car) {
       carService.insert(car);
    }

    @PutMapping("/{id}/change")
    public void update(@RequestBody Car car) {
        carService.update(car);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        carService.delete(id);
    }

    @GetMapping("/{id}")
    public Car show(@PathVariable Integer id) {
        return carService.show(id);
    }

    @GetMapping()
    public List<Car> list() {
        return carService.list();
    }

    @GetMapping("/{id}/parking")
    public String showParking(@PathVariable Integer id){
        return carService.showParking(id);
    }

    @GetMapping("/{id}/zone")
    public String showZone(@PathVariable Integer id){
        return carService.showZone(id);
    }

    @GetMapping("/{id}/place")
    public int showPlace(@PathVariable Integer id){
        return carService.showPlace(id);
    }
}
