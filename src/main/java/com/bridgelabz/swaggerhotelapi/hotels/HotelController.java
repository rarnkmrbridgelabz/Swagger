package com.bridgelabz.swaggerhotelapi.hotels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {


    @Autowired
    private HotelService hotelService;

    @GetMapping("/hotels/{postalCode}")
    public List<Hotel> getHotelsByPostalCode(@PathVariable Long postalCode) {
        return hotelService.findByPostalCode(postalCode);
    }
}