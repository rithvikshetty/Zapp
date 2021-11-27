package com.zapp.inventoryservice.services;

import com.zapp.inventoryservice.repository.InventoryRepository;
import com.zapp.inventoryservice.model.product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InventoryServices {
    private final InventoryRepository inventoryrepo;

    public InventoryServices(InventoryRepository inventoryrepo){
        this.inventoryrepo=inventoryrepo;
    }

    public List<product> getAllProducts(){
        return inventoryrepo.findAll();
    }

    public product getProduct(String ID){
        return inventoryrepo.findById(ID).orElse(null);
    }

    public List<product> getUndelivered(int status){
        return inventoryrepo.findByStatus(status);
    }

    public product addProduct(product p){
        return inventoryrepo.save(p);
    }

    public void deleteProduct(String id){
        inventoryrepo.deleteById(id);
    }

    public product updateRecepient(String rpt,String id) {
        product p1 = inventoryrepo.findById(id).get();
        p1.setRecepient(rpt);
        inventoryrepo.save(p1);
        return p1;
    }

    public void deleteAll() {
        inventoryrepo.deleteAll();
    }
}
