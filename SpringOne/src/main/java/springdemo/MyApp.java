package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
	
		//Create context object from the xml application context file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//getBean from he context
		Coach CricketCoach = ctx.getBean("CricketCoach",Coach.class);
		// Use the ctx to perform action
		System.out.println("CricketCoach: "+CricketCoach.getDailyWorkout());
		System.out.println("CricketCoach: "+CricketCoach.getDailyFortune());
		System.out.println("CricketCoach: "+CricketCoach.getTeamRanks());
		
		//Close the context
		ctx.close();
	
	}

}
