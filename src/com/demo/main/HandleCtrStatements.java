package com.demo.main;

public class HandleCtrStatements {
	
	public static void main(String[] args) {
		
		HandleCtrStatements ctrStatements = new  HandleCtrStatements();
		String result=ctrStatements.verifyEvenorOdd(4);//method call
		System.out.println("result:"+result);
		
		//ctrStatements.evenoddascendforloop(15, 20);
		//ctrStatements.evenoddascendwhileloop(1,10);
		String feedback = ctrStatements.getFeedback(10);
		System.out.println(feedback);
		
		
		
	}
	// method definition
     private String verifyEvenorOdd(int val) {
    	 //
    	 if(val%2==0) {
    		 return "even number";
    	 }
    	 else if(val%2==1) {
    		 return "oddnumber";
    	 }
    	 return null;
    	
     }
     
     private void evenoddascendforloop(int startindex,int endindex) 
     {
    	 for(int num=startindex;num<=endindex;num++) {
			 if(num%2==0) {
	    		System.out.println("even number:"+num);
	    	 }
	    	 else if(num%2==1) {
	    		 System.out.println("odd number:"+num);
	    	 }
		}
     }
     
     private void evenoddascendwhileloop(int startindex,int endindex) 
     {
    	 int num=startindex;
    	 while(num<=endindex) {
    		 if(num%2==0) {
 	    		System.out.println("even number:"+num);
 	    	 }
 	    	 else if(num%2==1) {
 	    		 System.out.println("odd number:"+num);
 	    	 }
    		 num++;
    	 }
     }
     
     
     private String getFeedback(int val)
     {
    	 switch (val) {
		case 1:
			
			return "BAD";
			
		case 2:
			return "AVERGAGE";
			
		case 3:
			return "GOOD";
			
		case 4:
			return "EXCELLENT";

		default:
			return "customer hesitated to provide feedback";
			
		}
     }
     
     
     
     
     
     
	
	

}
