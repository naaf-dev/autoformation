package com.luv2code.springdemo;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
@PropertySource("classpath:mylogger.properties")
public class SportConfig {
	
	// config bean expose
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
	// config log display
	@Value("${root.logger.level}")
	private String rootLoggerLevel;
 
	@Value("${printed.logger.level}")
	private String printedLoggerLevel;
	
	@PostConstruct
	public void initLogger() {
 
		// parse levels
		Level rootLevel = Level.parse(rootLoggerLevel);
		Level printedLevel = Level.parse(printedLoggerLevel);
		
		// get logger for app context
		Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());
 
		// get parent logger
		Logger loggerParent = applicationContextLogger.getParent();
 
		// set root logging level
		loggerParent.setLevel(rootLevel);
		
		// set up console handler
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(printedLevel);
		consoleHandler.setFormatter(new SimpleFormatter());
		
		// add handler to the logger
		loggerParent.addHandler(consoleHandler);
	}
}
