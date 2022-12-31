package com.intern.parkinglot.controller;

import com.intern.parkinglot.model.Parking;
import com.intern.parkinglot.service.ParkingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {
    @Autowired
    private ParkingServiceImpl parkingService;

    @PostMapping("/add")
    public void insert(@RequestBody Parking parking) {
        parkingService.insert(parking);
    }

    @PutMapping("/{id}/change")
    public void update(@RequestBody Parking parking) {
        parkingService.update(parking);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        parkingService.delete(id);
    }

    @GetMapping("/{id}")
    public Parking show(@PathVariable Integer id) {
        return parkingService.show(id);
    }

    @GetMapping()
    public List<Parking> list() {
        return parkingService.list();
    }

    @GetMapping("/{id}/zones")
    public List<String> showZones(@PathVariable Integer id){
        return parkingService.showZones(id);
    }

}
