package org.gk.controller;

import org.gk.model.HotelModel;
import org.gk.request.Request;
import org.gk.response.Response;
import org.gk.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/hc")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @RequestMapping(value = "/getEntity", method = RequestMethod.POST)
    public HotelModel getEntity(){
        String id = "1";
        return hotelService.getEntity(id);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<HotelModel> getAll(){
        return hotelService.getAll();
    }

    @RequestMapping(value = "/getAllUnmappedEntities", method = RequestMethod.POST)
    public List<HotelModel> getAllUnmappedEntities(){
        return hotelService.getAllUnmappedEntities();
    }

    @RequestMapping(value = "/addEntity", method = RequestMethod.POST)
    public void addEntity(@RequestBody Request request) {

        Response response = hotelService.addEntity(request);
    }
}
