package annotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] arr= {
			"Hello Beautiful, Have Goood day!!",
			"Todays's day is lucky for you!!!",
			"Hope is a good thing my friend.",
			"Let's Agree to Disagree."
	};
	
	private Random rand=new Random();
	@Override
	public String getFortune() {
		int index=rand.nextInt(arr.length);
		
		
		return arr[index];
	}

}
