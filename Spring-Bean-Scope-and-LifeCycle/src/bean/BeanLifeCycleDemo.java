package bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Coach;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach ACoach = context.getBean("myCoach", Coach.class);
		
		
		System.out.println(ACoach.getDailyWorkout());
		
		context.close();

	}

}