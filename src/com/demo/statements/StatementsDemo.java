package com.demo.statements;

public class StatementsDemo {
	
	public static void main(String[] args) {
		boolean value =3>4?false:true;
		//System.out.println(value);
		
		String communicationType = getMessage(2);
		//System.out.println(communicationType);
		
		int option =getOption("message");
		System.out.println(option);
		
		
		
	}
	
	private static String getMessage(int number) {
		switch (number) {
		case 1:
			return "phone call";
		
		case 2 :
			return "voice message";
		
		case 3 : 
			return "message";
		
		case 4 :
			return "email";
			
			 default:
			return "invalid option";
		}
	}
	
	private static int getOption(String type) {
		int option =0;
		switch (type) {
		case "phone call":
			option=1;
		break;
		case "voice message" :
			option=2;
			break;
		case "message" : 
			option=3;
		break;
		case "email":
		option=4;
			
			 default:
				 option=0 ;
				 break;
		}
		
		return option;
	}
	
	
	
	
	
	
	 

}
