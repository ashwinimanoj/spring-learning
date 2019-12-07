package com.example.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("In setEmailAddress()");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("In setTeam()");
		this.team = team;
	}

	private FortuneService fortuneService;
	
	CricketCoach() {
		System.out.println("In CricketCoach()");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In setFortuneService()");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
