package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Shoot the ball 20 times";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
