package org.gk.persistence;

import org.gk.model.HotelModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//public class HotelRepository {
//    @Autowired
//    private MongoTemplate mongoTemplate;
//
//    public List<HotelModel> getHotels(){
//        return mongoTemplate.findAll(HotelModel.class);
//    }
//}

public interface HotelRepository extends MongoRepository<HotelModel, String> {

}
