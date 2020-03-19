package com.luv2code.springdemo;

public interface Coach {

	String getDailyWorkout();
	default String getDailyFortune() {
		return "getDailyFortune";
	}

}