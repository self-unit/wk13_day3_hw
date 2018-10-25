package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	DistilleryRepository distilleryRepository;

	@Autowired
	WhiskyRepository whiskyRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetDistilleriesWithWhiskyOfCertainAge() {
		List<Distillery> results = distilleryRepository.getDistilleriesWithParticularWhiskyAge(12);
	}

	@Test
	public void canGetWhiskysOfParticularAgeFromDistillery(){
		List<Whisky> results = distilleryRepository.getWhiskysOfParticularAgeFromDistillery("Rosebank", 12);
	}

	@Test
	public void canGetWhiskysOfParticularAgeFromDistillery2(){
		List<Whisky> results = whiskyRepository.getWhiskysOfParticularAgeFromDistillery("Glendronach", 12);
	}

	@Test
	public void canGetDistilleriesWithParticularRegion(){
		List<Distillery> results = distilleryRepository.getDistilleryWithParticularRegion("Speyside");
	}

	@Test
	public void canGetWhiskiesFromParticularRegion() {
		List<Whisky> results = whiskyRepository.getWhiskiesFromRegion("Highland");
	}

	@Test
	public void canGetWhiskiesOfParticularAge() {
		List<Whisky> results = whiskyRepository.getWhiskiesOfParticularYear(1991);
	}

}
