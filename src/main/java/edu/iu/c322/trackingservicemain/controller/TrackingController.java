package edu.iu.c322.trackingservicemain.controller;

import edu.iu.c322.trackingservicemain.model.Tracking;
import edu.iu.c322.trackingservicemain.repository.TrackingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class TrackingController {
    private TrackingRepository repository;


    public TrackingController(TrackingRepository repository){
        this.repository = repository;
    }



    @GetMapping("/{orderId}/{itemId}")
    public List<Tracking> find(@PathVariable int orderId,
                               @PathVariable int itemId){
        return repository.findByOrderIdAndItemId(orderId, itemId);
    }
}
