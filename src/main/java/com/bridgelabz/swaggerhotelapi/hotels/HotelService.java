package com.bridgelabz.swaggerhotelapi.hotels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
class HotelService {

    private static Map<Long, List<Hotel>> hotels = new HashMap<>();



    static {
        hotels.put(600040L, prepareAnnaNagarHotels());
        hotels.put(600020L, prepareAdyarHotels());
        hotels.put(600008L, prepareEgmoreHotels());
    }



    private static List<Hotel> prepareAnnaNagarHotels() {
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel(1, "GM Residency", 21L, 5L, "3.6/5"));
        hotels.add(new Hotel(2, "Treebo Trend", 43L, 15L, "4.1/5"));
        hotels.add(new Hotel(3, "FabHotel", 24L, 7L, "4.0/5"));
        hotels.add(new Hotel(4, "Royal Palace", 47L, 21L, "4.2/5"));
        return hotels;
    }

    private static List<Hotel> prepareAdyarHotels() {
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel(5, "Ginger Chennai", 61L, 23L, "4.6/5"));
        hotels.add(new Hotel(6, "AMS Raj Palace Sundar", 34L, 10L, "4.1/5"));
        hotels.add(new Hotel(7, "Crescent Stay", 33L, 12L, "4.0/5"));
        hotels.add(new Hotel(8, "King Cross", 20L, 5L, "4.4/5"));
        return hotels;
    }

    private static List<Hotel> prepareEgmoreHotels() {
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel(9, "Radisson Blu Hotel Chennai City Centre", 21L, 5L, "3.6/5"));
        hotels.add(new Hotel(10, "Palette Resorts - Harrisons Hotel Deluxe", 43L, 15L, "4.1/5"));
        hotels.add(new Hotel(11, "Taj Connemara", 24L, 7L, "4.0/5"));
        hotels.add(new Hotel(12, "Taj Coromandel", 47L, 21L, "4.9/5"));
        hotels.add(new Hotel(13, "Taj Club House", 56L, 11L, "4.9/5"));
        hotels.add(new Hotel(14, "The Park Chennai", 88L, 9L, "4.9/5"));
        hotels.add(new Hotel(15, "The Accord Metropolitan", 72L, 6L, "4.9/5"));
        hotels.add(new Hotel(16, "Hyatt regency Chennai", 58L, 16L, "4.9/5"));
        hotels.add(new Hotel(17, "The Residency Towers", 72L, 6L, "4.9/5"));


        return hotels;
    }

    List<Hotel> findByPostalCode(Long postalCode) {
        return hotels.get(postalCode);
    }
}