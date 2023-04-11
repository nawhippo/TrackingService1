package edu.iu.c322.trackingservicemain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Tracking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int orderId;

    private int itemId;

    private String status;

    private Date date;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }





}
