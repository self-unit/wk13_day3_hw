package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;

import java.util.List;

public interface WhiskyRepositoryCustom {
    public List<Distillery> getDistilleriesWithParticularWhiskyAge(int age);
}
