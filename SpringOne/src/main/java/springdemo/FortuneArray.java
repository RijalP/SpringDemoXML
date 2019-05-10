package springdemo;

import java.util.Random;

public class FortuneArray implements FortuneService {

	private String fortuneOne;
	
	public String getFortuneOne() {
		return fortuneOne;
	}

	public String getFortuneTwo() {
		return fortuneTwo;
	}

	public String getFortuneThree() {
		return fortuneThree;
	}

	private String fortuneTwo;
	private String fortuneThree;
	
	
	public String getFortuneValues(){
		return fortuneOne;
//		Random rand = new Random(); 
//		int pickedNumber = rand.nextInt(fortuneValues.length) + 1;
//		return fortuneValues[pickedNumber];
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return getFortuneValues();
	}

	public void setFortuneOne(String fortuneOne) {
		this.fortuneOne = fortuneOne;
	}

	public void setFortuneTwo(String fortuneTwo) {
		this.fortuneTwo = fortuneTwo;
	}

	public void setFortuneThree(String fortuneThree) {
		this.fortuneThree = fortuneThree;
	}

}
