package com.rainwater.collection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/collection")
public class CollectionController {

    @GetMapping("/status")
    public String getStatus() {
        return "Collection service is running";
    }

    // Additional endpoints related to rainwater collection can be added here
}