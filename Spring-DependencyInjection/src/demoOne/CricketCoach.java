package demoOne;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String email;
	private String team;
	
	public CricketCoach()
	{
		
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Bat 2 hours daily";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
