package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistilleryRepository extends JpaRepository<Distillery, Long>, DistilleryRepositoryCustom {
    public List<Whisky> getWhiskysOfParticularAgeFromDistillery(String distillery, int age);
    public List<Distillery> getDistilleriesWithParticularWhiskyAge(int age);
    public List<Distillery> getDistilleryWithParticularRegion(String region);
}
