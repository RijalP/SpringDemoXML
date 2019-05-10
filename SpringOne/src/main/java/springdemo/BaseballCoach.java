package springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(){};
	public BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout(){
		return "Practice Baseball for 30mins";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	@Override
	public String getTeamRanks() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
