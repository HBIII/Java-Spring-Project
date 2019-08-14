package bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Coach;

public class BeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach ACoach = context.getBean("myCoach", Coach.class);
		
		Coach BCoach = context.getBean("myCoach", Coach.class);
		
		Boolean result=(ACoach==BCoach);
		
		System.out.println("Is the Scope Singleton? " + result);
		
		System.out.println(ACoach);
		System.out.println(BCoach);

	}

}
