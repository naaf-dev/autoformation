package com.luv2code.springdemo;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;

	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "swim a 1000 meter";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
