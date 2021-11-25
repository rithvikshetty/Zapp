package com.zapp.inventoryservice.repository;

import com.zapp.inventoryservice.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface InventoryRepository extends JpaRepository<product,String>{
    List<product> findByStatus(int status);
}