package com.example.demo.controllers;

import com.example.demo.entities.Location;
import com.example.demo.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationRESTController{
    @Autowired
    LocationRepository locationRepository;

    @GetMapping
    public List<Location> getLocations(){

        return  locationRepository.findAll();
    }

    @PostMapping
    public Location createLocation(@RequestBody Location location){

        return locationRepository.save(location);
    }
}
