package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		boolean result = theCoach == alphaCoach;
		System.out.println("Are the beans same? : " + result);
		System.out.println("Memory location of theCoach " + theCoach);
		System.out.println("Memory location of alphaCoach" + alphaCoach);
		
		context.close();
	}

}
