package com.rainwater.purification.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurificationController {

    @GetMapping("/purify")
    public String purifyWater() {
        // Logic for purifying water
        return "Water purification process initiated.";
    }
}