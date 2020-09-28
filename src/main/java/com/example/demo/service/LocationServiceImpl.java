package com.example.demo.service;

import com.example.demo.entities.Location;
import com.example.demo.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocationServiceImpl implements LocationService{

@Autowired
   private LocationRepository repository;

    @Override
    public Location saveLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        repository.delete(location);

    }

    @Override
    public Location getLocationById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Location> getAllLocations() {
        return repository.findAll();
    }
}
