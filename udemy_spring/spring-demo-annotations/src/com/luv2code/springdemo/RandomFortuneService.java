package com.luv2code.springdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	Random r;
	List<String> fortunes;
	
	@PostConstruct
	private void startup() {
		r = new Random();
		try {
			fortunes = Files.readAllLines(Paths.get("src/fortune.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public String getFortune() {
		int index = r.nextInt(fortunes.size());
		return fortunes.get(index);
	}

}
