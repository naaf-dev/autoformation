package section10.activity7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Activity7 {

	public static void main(String[] args) {
		// load spring java class config
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from spring context
		Coach coach = context.getBean("boxeCoach", Coach.class);
		
		// call bean methods
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		// close spring context
		context.close();
		
        
        
	}

}
