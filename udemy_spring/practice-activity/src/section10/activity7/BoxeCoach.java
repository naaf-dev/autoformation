package section10.activity7;

public class BoxeCoach implements Coach {
	
	private FortuneService fortuneService;

	public BoxeCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "pratice your left punch";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
