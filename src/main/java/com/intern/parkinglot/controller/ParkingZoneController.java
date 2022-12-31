package com.intern.parkinglot.controller;

import com.intern.parkinglot.model.ParkingZone;
import com.intern.parkinglot.service.ParkingZoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zone")
public class ParkingZoneController {
    @Autowired
    private ParkingZoneServiceImpl parkingZoneService;

    @PostMapping("/add")
    public void insert(@RequestBody ParkingZone parkingZone) {
        parkingZoneService.insert(parkingZone);
    }

    @PutMapping("/{id}/change")
    public void update(@RequestBody ParkingZone parkingZone) {
        parkingZoneService.update(parkingZone);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        parkingZoneService.delete(id);
    }

    @GetMapping("/{id}")
    public ParkingZone show(@PathVariable Integer id) {
        return parkingZoneService.show(id);
    }

    @GetMapping()
    public List<ParkingZone> list() {
        return parkingZoneService.list();
    }

    @GetMapping("/{id}/places")
    public List<Integer> showPlaces(@PathVariable Integer id){
        return parkingZoneService.showPlaces(id);
    }

}
