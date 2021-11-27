package com.zapp.driverservices.model;

import javax.persistence.*;
import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class driver {
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private int avail;
    @Column
    private int pin;
    
    public driver(){

    }

    public driver(String id, String name, int avail, int pin){
        this.id=id;
        this.name=name;
        this.avail=avail;
        this.pin=pin;
    }

    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAvail(int avail){
        this.avail=avail;
    }

    public int getAvail(){
        return avail;
    }

    public void setPin(int pin){
        this.pin=pin;
    }

    public int getPin(){
        return pin;
    }

}
