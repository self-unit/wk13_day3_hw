package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "{distillery}/{age}")
    public List<Whisky> getWhiskiesOfParticularAge(@PathVariable String distillery, @PathVariable int age) {
        return distilleryRepository.getWhiskysOfParticularAgeFromDistillery(distillery, age);
    }

    @GetMapping(value = "whisky/{age}")
    public List<Distillery> getDistilleriesWithParticularWhiskyAge(@PathVariable int age) {
        return distilleryRepository.getDistilleriesWithParticularWhiskyAge(age);
    }

    @GetMapping(value = "region/{region}")
    public List<Distillery> getWhiskiesOfParticularAge(@PathVariable String region) {
        return distilleryRepository.getDistilleryWithParticularRegion(region);
    }

}
