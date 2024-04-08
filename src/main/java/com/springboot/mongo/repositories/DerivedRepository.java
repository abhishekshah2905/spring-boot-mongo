package com.springboot.mongo.repositories;

import com.springboot.mongo.models.Derived;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DerivedRepository extends MongoRepository<Derived, String> {
    List<Derived> findByFieldA(String fieldA);

    List<Derived> findByFieldB(String fieldB);
}
