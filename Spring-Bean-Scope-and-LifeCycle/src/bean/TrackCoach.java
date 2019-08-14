package bean;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend 60 minutes";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+ fortuneService.getFortune();
	}
	
	public void startup() {
		System.out.println("At the initialization of the bean");
	}
	
	public void afterdestroy() {
		System.out.println("After destroying the bean ");
	}

}
