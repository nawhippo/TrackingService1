package edu.iu.c322.trackingservicemain.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController  {
    @GetMapping("/")
    public String home() {

        return "Welcome to the tracking service!";
    }
}
