package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	//define private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use the dependency to get a fortune
		return fortuneService.getDailyFortune();
	}

	// add an init method 
	public void doMyStartupStuff(){
		System.out.println("doMyStartupStuff ");
	}
	
	// add an destroy method
	public void doMyCleanupStuff(){
		System.out.println("doMyCleanupStuff");
	}
	
}
