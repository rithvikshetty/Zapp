package com.zapp.inventoryservice.controller;

import com.zapp.inventoryservice.model.product;
import com.zapp.inventoryservice.services.InventoryServices;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class InventoryController{
    private final InventoryServices inventoryservice;

    public InventoryController(InventoryServices inventoryservice){
        this.inventoryservice=inventoryservice;
    }

    @GetMapping("/getAllProducts")
    public List<product> getAll(){
        return inventoryservice.getAllProducts();
    }

    @GetMapping("/get/{id}")
    public product getProduct(@PathVariable String id){
        return inventoryservice.getProduct(id);
    }

    @GetMapping("/getUndeli/{status}")
    public List<product> getUndeliProduct(@PathVariable int status){
        return inventoryservice.getUndelivered(status);
    }

    @PostMapping("/addProduct")
    public product createproduct(@RequestBody product p){
        return inventoryservice.addProduct(p);
    }

    @PutMapping("/updateRecepient/{id}")
    public product updateproduct(@RequestBody String rpt,@PathVariable String id){
        return inventoryservice.updateRecepient(rpt,id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteProducts(){
        inventoryservice.deleteAll();
        return "ALL PRODUCTS DELETED!!!!";
    }
}
