package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// check if they are the same beans
		boolean isSame = theCoach == alphaCoach;

		System.out.println("Pointing to the same object " + isSame);
		System.out.println("the memory location for theCoach " + theCoach);
		System.out.println("the memory location for alphaCoach" + alphaCoach);

		// close the context
		context.close();
	}

}
