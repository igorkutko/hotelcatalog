package org.gk.service;

import org.gk.model.HotelModel;
import org.gk.persistence.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository repository;

    private static List<HotelModel> hotels = new ArrayList<>();
    static {
        hotels.add(new HotelModel("1","hotel 1","country 1"));
        hotels.add(new HotelModel("2","hotel 2","country 2"));
        hotels.add(new HotelModel("3","hotel 3","country 3"));
        hotels.add(new HotelModel("4","hotel 4","country 4"));
        hotels.add(new HotelModel("5","hotel 5","country 5"));
    }
    public HotelModel getEntity(String id){
        return repository.findOne(id);
    }

    public List<HotelModel> getAll(){
        return repository.findAll();
    }

    public List<HotelModel> getAllUnmappedEntities(){
        return repository.findAll();
    }

    public HotelModel addEntity(HotelModel hotelModel) {
        return repository.save(hotelModel);
    }

    public HotelModel updateEntity(HotelModel hotelModel) {
        return repository.save(hotelModel);
    }

    public void deleteEntity(String id){
        repository.delete(id);
    }

}
