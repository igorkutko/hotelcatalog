package org.gk.controller;

import org.gk.model.HotelModel;
import org.gk.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @RequestMapping
    public List<HotelModel> getHotels(){
        return hotelService.getHotels();
    }
}
