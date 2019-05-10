package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp1 {

	public static void main(String[] args) {
		
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve bean from spring container
		Coach theCoach = context.getBean("BaseballCoach",BaseballCoach.class);
		
		//call methods on the bean
		System.out.println("What ? "+theCoach.getDailyWorkout() +" and "+
		theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
