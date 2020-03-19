package com.luv2code.springdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private List<String> fortunes = Arrays.asList(
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
			);
	
	@Override
	public String getDailyFortune() {
		Random r = new Random();
		return fortunes.get(r.nextInt(fortunes.size()));
	}
	
	

}
