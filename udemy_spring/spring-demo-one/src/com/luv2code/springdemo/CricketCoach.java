package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public CricketCoach() {
		System.out.println("CricketCoach : inside constructor ");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minuts";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setFortuneService ");
		
		this.fortuneService = fortuneService;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "CricketCoach [emailAddress=" + emailAddress + ", team=" + team + "]";
	}
	
	
	
	
	

}
