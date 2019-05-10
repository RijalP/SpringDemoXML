package springdemo;

public class CricketCoach implements Coach {

	private FortuneService cfortuneservice;
	private FortuneArray cfortunearray;
	private String team;
	private String rank;
	
public void setTeam(String team) {
		this.team = team;
	}



	public void setRank(String rank) {
		this.rank = rank;
	}



public void setCfortunearray(FortuneArray cfortunearray) {
	System.out.println("Inside CricketCoach FortuneArray Setter");
		this.cfortunearray = cfortunearray;
	}



	//Setter method for dependency injection using setter
	public void setCfortuneservice(FortuneService cfortuneservice) {
		System.out.println("Inside CricketCoach FortuneService Setter");
		this.cfortuneservice = cfortuneservice;
	}



	@Override
	public String getDailyWorkout() {
		
		return " Practice Balling and Batting for 15 mins each ";
	}

	@Override
	public String getDailyFortune() {
		
		return  cfortunearray.getFortune();
	}
	
	public String getTeamRanks(){
		return "Team: "+team + " and rank is " +rank ;
	}
	

}
