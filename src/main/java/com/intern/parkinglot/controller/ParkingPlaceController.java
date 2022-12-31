package com.intern.parkinglot.controller;

import com.intern.parkinglot.model.ParkingPlace;
import com.intern.parkinglot.service.ParkingPlaceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/place")
public class ParkingPlaceController {
    @Autowired
    private ParkingPlaceServiceImpl parkingPlaceService;

    @PostMapping("/add")
    public void insert(@RequestBody ParkingPlace parkingPlace) {
        parkingPlaceService.insert(parkingPlace);
    }

    @PutMapping("/{id}/change")
    public void update(@RequestBody ParkingPlace parkingPlace) {
        parkingPlaceService.update(parkingPlace);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        parkingPlaceService.delete(id);
    }

    @GetMapping("/{id}")
    public ParkingPlace show(@PathVariable Integer id) {
        return parkingPlaceService.show(id);
    }

    @GetMapping()
    public List<ParkingPlace> list() {
        return parkingPlaceService.list();
    }

    @GetMapping("{id}/car")
    public String showCar(@PathVariable Integer id){
        return parkingPlaceService.showCar(id);
    }
}
