package com.demo.oops.encapusultion;

import com.demo.dto.Configuration;

public class OOPSTest {

	public static void main(String[] args) {
		/*Sim sim1 = new  Airtel();
		Configuration airtelconf= sim1.getSimConfiguration();
		
		System.out.println(airtelconf);
		
		Sim sim2 = new  Idea();
		Configuration ideaconf= sim2.getSimConfiguration();
		
		System.out.println(ideaconf);
		
		//airtel vendor wants to check sim size without main client
		
		Airtel airtel =new  Airtel();
		System.out.println(airtel.getSimSize());
		
		//idea vendor wants to check sim size without main client
		
		Idea idea = new Idea();
		System.out.println(idea.getSimSize());*/
		
		
		Notification emailnotification = new EmailNotification();
		
		System.out.println(emailnotification.getMessage());
		
		Notification messagenotification = new MessageNotification();
		System.out.println(messagenotification.getMessage());
		

	}

}
