package com.luv2code.springdemo;

public class SpringCoach implements Coach {
	
	private FortuneService fortuneService;
	
	

	public SpringCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyFortune() {
		return "Just do it : " + fortuneService.getDailyFortune();
	}



	@Override
	public String getDailyWorkout() {
		return "Spend one hour doing your spring course";
	}

}
