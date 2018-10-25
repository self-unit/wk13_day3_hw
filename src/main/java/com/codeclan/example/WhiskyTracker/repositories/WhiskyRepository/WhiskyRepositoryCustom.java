package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {
    public List<Whisky> getWhiskiesFromRegion(String region);
    public List<Whisky> getWhiskysOfParticularAgeFromDistillery(String distillery, int age);
    public List<Whisky> getWhiskiesOfParticularYear(int year);
}
