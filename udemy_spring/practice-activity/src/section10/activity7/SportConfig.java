package section10.activity7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
	
	// bean definition
	
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean 
	public Coach boxeCoach() {
		return new BoxeCoach(happyFortuneService());
	}

}
