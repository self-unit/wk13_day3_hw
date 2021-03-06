package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "year/{year}")
    public List<Whisky> getWhiskiesOfParticularYear(@PathVariable int year) {
        return whiskyRepository.getWhiskiesOfParticularYear(year);
    }

    @GetMapping(value = "region/{region}")
    public List<Whisky> getWhiskiesFromRegion(@PathVariable String region) {
        return whiskyRepository.getWhiskiesFromRegion(region);
    }

    @GetMapping(value = "distillery/{distillery}/{age}")
    public List<Whisky> getWhiskysOfParticularAgeFromDistillery(@PathVariable String distillery, @PathVariable int age) {
        return whiskyRepository.getWhiskysOfParticularAgeFromDistillery(distillery, age);
    }
}
