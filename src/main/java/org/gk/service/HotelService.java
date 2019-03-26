package org.gk.service;

import org.gk.model.HotelModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {
    private static List<HotelModel> hotels = new ArrayList<>();
    static {
        hotels.add(new HotelModel("1","hotel 1","country 1"));
        hotels.add(new HotelModel("2","hotel 2","country 2"));
        hotels.add(new HotelModel("3","hotel 3","country 3"));
        hotels.add(new HotelModel("4","hotel 4","country 4"));
        hotels.add(new HotelModel("5","hotel 5","country 5"));
    }
    public List<HotelModel> getHotels(){
        return hotels;
    }
}
