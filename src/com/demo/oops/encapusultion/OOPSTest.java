package com.demo.oops.encapusultion;

import com.demo.dto.Configuration;
import com.demo.dto.Profile;
import com.demo.oops.polymorphism.Item;
import com.demo.oops.polymorphism.MeritStudent;
import com.demo.oops.polymorphism.Store;
import com.demo.oops.polymorphism.Student;

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
		
		
		/*Notification emailnotification = new EmailNotification();
		
		System.out.println(emailnotification.getMessage());
		
		Notification messagenotification = new MessageNotification();
		System.out.println(messagenotification.getMessage());*/
		
		/*NotificationFactory factory = new NotificationFactory();
		Notification emailnotification = factory.getNotification("email");
		System.out.println(emailnotification.getMessage());
		
		//message notification
		
		Notification messagenotification = factory.getNotification("message");
		System.out.println(messagenotification.getMessage());*/
		
		/*Student student = new MeritStudent();
		Profile profile=student.getStudentProfie();
		System.out.println(student.getStudentProfie());
		System.out.println(student.getStudentSection());*/
		
		
		Store store = new Store(new Item(1, "shirts", "retail"), 100);
		System.out.println(store);
		Store store1 = new Store(new Item(1, "shirts", "retail"), 100,"reddy jewllweers");
		System.out.println(store1);
	}

}
