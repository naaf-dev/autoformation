package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String mail;
	
	@Value("${foo.team}")
	private String team;
	
	@Autowired
	public TennisCoach(	@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	// define my init method
	@PostConstruct
	public void startup() {
		System.out.println("startup");
	}
	// define my destroy method
	
	@PreDestroy
	public void cleanup() {
		System.out.println("cleanup");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Pratice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String toString() {
		return "TennisCoach [mail=" + mail + ", team=" + team + "]";
	}
	
	

}
