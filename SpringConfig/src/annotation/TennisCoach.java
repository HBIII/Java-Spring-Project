package annotation;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
									
	private FortuneService fortuneService;
	
	public TennisCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		return "Practice frontend volley 30 mins ";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
