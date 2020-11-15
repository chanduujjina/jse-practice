package com.demo.oops.encapusultion;

public class NotificationFactory {
	
	public Notification getNotification(String type)

	{
		if(type.equalsIgnoreCase("email")) {
			return new EmailNotification();
		}
		else if(type.equals("message")) {
			return new MessageNotification();	 
		}
		return null;
	}
	
}

