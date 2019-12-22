package com.example.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it, " + fortuneService.getFortune();
	}

	//add init method
	public void initMethod() {
		System.out.println("Track Coach's Init");
	}
	
	//add destroy method
	public void destroyMethod() {
		System.out.println("Track Coach's Destroy");
	}
}
