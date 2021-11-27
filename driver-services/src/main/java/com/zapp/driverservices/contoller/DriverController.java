package com.zapp.driverservices.contoller;

import com.zapp.driverservices.model.driver;
import com.zapp.driverservices.services.DriverServices;
import org.springframework.web.bind.annotation.*;

import java.util.*;
public class DriverController {
    private final DriverServices driverservices;

    public DriverController(DriverServices driverServices){
        this.driverservices=driverServices;
    }

    @GetMapping("/getAllDrivers")
    public List<driver> getAll(){
        return driverservices.getAllDrivers();
    }

    @GetMapping("/getAvailable/{avail}")
    public List<driver> getAvailDrivers(@PathVariable int avail){
        return driverservices.getAvail(avail);
    }

    @PostMapping("/addDriver")
    public String addDrivers(@RequestBody driver d){
        try {
            driverservices.addDriver(d);
        } catch (Exception e) {
            return "Couldn't add the Driver Details";
        }
        return "Driver added Successfully!!";
        
    }

    @PutMapping("/updateStatus/{id}")
    public String updateDriver(@RequestBody int avail, @PathVariable String id){
        try {
            driverservices.updateAvail(id, avail);
        } catch (Exception e) {
            return "Update Failed!!!";
        }
        return "Update Successful!!!";
        
        
    }
}