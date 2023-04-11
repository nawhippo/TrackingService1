package edu.iu.c322.trackingservicemain.controller;

import edu.iu.c322.trackingservicemain.model.Tracking;
import edu.iu.c322.trackingservicemain.repository.TrackingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Customers")
public class TrackingController {
    private TrackingRepository repository;


    public TrackingController(TrackingRepository repository){
        this.repository = repository;
    }



    @GetMapping("/{orderId}/{itemId}")
    public List<Tracking> find(@PathVariable int orderId, @PathVariable int itemId){
        return repository.findByOrderIdAndItemId(orderId, itemId);
    }


    @PutMapping("/{orderId}/{itemId}/{status}")
    public List<Tracking> updateStatus(@PathVariable int orderId, @PathVariable int itemId, @PathVariable String status) {
        List<Tracking> trackings = repository.findByOrderIdAndItemId(orderId, itemId);
        for (Tracking tracking : trackings) {

            tracking.setStatus(status);

            repository.save(tracking);
        }
        return trackings;
    }
}
