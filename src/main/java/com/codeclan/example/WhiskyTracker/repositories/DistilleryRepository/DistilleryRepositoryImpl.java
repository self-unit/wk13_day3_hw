package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {

    //TODO: create a method to find all whiskeys of a particular year
    //TODO: create a method to find all whiskeys of a particular region
    //TODO: create a method to find all distilleries of a particular region
    //TODO: create a method to find all whiskeys of a particular distillery with a specific age
    //TODO: create a method to find all distilleries that have whiskey of a particular age

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Distillery> getDistilleriesWithParticularWhiskeyAge(){

    }
}
