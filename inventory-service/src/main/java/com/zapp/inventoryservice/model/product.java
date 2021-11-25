package com.zapp.inventoryservice.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
//import javax.persistence.Id;

@Entity
@Table
public class product {
    @Id
    private String id;
    @Column
    private String pname;
    @Column
    private String rpt;
    @Column
    private String date;
    @Column
    private int status;
    public product(){

    }
    public product(String name,String rp, String dat,int stat){
        pname=name;
        rpt=rp;
        date=dat;
        status=stat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRecepient() {
        return rpt;
    }

    public void setRecepient(String rpt) {
        this.rpt = rpt;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}