package com.demo.oops.encapusultion;

import com.demo.dto.Message;

public interface Notification {
	
	Message getMessage();

}


class EmailNotification implements Notification{

	@Override
	public Message getMessage() {
		
		return new Message(1, "email","sent notication to cujjina@gmail.com");
	}
	
	
	
}

class MessageNotification implements Notification{

	@Override
	public Message getMessage() {
		return new Message(2, "phone","sent notication to 9573532532");
	}
	
}