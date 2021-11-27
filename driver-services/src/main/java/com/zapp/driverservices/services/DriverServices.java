package com.zapp.driverservices.services;

import com.zapp.driverservices.repository.DriverRepository;
import com.zapp.driverservices.model.driver;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DriverServices {
    private final DriverRepository driverRepository;

    public DriverServices(DriverRepository driverRepository){
        this.driverRepository=driverRepository;
    }

    public List<driver> getAllDrivers(){
        return driverRepository.findAll();
    }

    public List<driver> getAvail(int avail){
        return driverRepository.findByAvail(avail);
    }

    public void updateAvail(String id, int avail){
        driver p = driverRepository.findById(id).get();
        p.setAvail(avail);
        driverRepository.save(p);
    }

    public void delete(String id){
        driverRepository.deleteById(id);
    }

    public void deleteAll(){
        driverRepository.deleteAll();
    }
}
