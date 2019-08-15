package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

														/* ---- Field Dependency Injection ----*/
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Inside Constructor ");
	}
	
														/* ---- Constructor Dependency Injection ----*/
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
														/* ---- Setter Dependency Injection ----*/
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
														/* ---- Method Dependency Injection ----*/
	
	/*@Autowired
	public void sampleMethod(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice frontend volley 30 mins ";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
