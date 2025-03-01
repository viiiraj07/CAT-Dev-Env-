package com.cat.cat.Repository;


import com.cat.cat.Model.ParcelData;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParcelRepository extends MongoRepository<ParcelData, ObjectId> {

    Optional<ParcelData> findParcelDataByOrderId(Long orderId);

    Optional<ParcelData> deleteParcelDataByOrderId(Long orderId);
}
