package com.vagif.service;

import com.vagif.entity.Location;

import java.util.List;
import java.util.Optional;

public interface LocationService {

    Location saveLocation(Location location);
    Location updateLocation(Location location);
    void deleteLocation(Location location);
    Optional<Location> getLocationById(int id);
    List<Location> getAllLocations();

}
