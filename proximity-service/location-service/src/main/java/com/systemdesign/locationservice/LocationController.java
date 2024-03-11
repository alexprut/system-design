package com.systemdesign.locationservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LocationController {
    @GetMapping("/v1/search/nearby")
    public HashMap<String, String> getLocations(@RequestParam double latitude, @RequestParam double longitude, @RequestParam int radius) {
        HashMap<String, String> data = new HashMap<>();

        data.put("latitude", String.valueOf(latitude));
        data.put("longitude", String.valueOf(longitude));
        data.put("radius", String.valueOf(radius));

        return data;
    }
}
