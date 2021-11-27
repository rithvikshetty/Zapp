package com.zapp.driverservices.repository;

import com.zapp.driverservices.model.driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface DriverRepository extends JpaRepository<driver,String>{
    List<driver> findByAvail(int avail);
}
