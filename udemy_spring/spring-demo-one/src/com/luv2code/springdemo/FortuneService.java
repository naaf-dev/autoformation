package com.luv2code.springdemo;

public interface FortuneService {
	default String getDailyFortune() {
		return "getDailyFortune";
	}
}
