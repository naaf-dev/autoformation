package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean from spring container
		Coach theCoach = context.getBean("myCricketCoach", Coach.class);
		
		System.out.println(theCoach);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// let call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
