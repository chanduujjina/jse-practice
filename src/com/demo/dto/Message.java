package com.demo.dto;

public class Message {
	
	@Override
	public String toString() {
		return "Message [messageid=" + messageid + ", messageType=" + messageType + ", customMessage=" + customMessage
				+ "]";
	}

	public String getCustomMessage() {
		return customMessage;
	}

	public int getMessageid() {
		return messageid;
	}

	public String getMessageType() {
		return messageType;
	}

	public Message(int messageid, String messageType ,String customMessage) {
		super();
		this.messageid = messageid;
		this.messageType = messageType;
		this.customMessage = customMessage;
	}

	private int messageid;
	
	private String messageType;
	
	private String customMessage;
	
	

	

}
