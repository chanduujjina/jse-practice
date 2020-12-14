package com.demo.StringHandlers;

public class StringOperations {

	public static void main(String[] args) {
		// first way
		//String pool
		String s1 = "pavan is a lecturer";
		
		
		//String pool
		String s2 ="pavan is a lecturer";
		
		// it will store in heap area
		String s3 = new  String("pavan is a lecturer").intern();
		// == method will compare the reference
		//intern method will store value in object which resides in heap memory will copy the same to string pool
		boolean val= s1==s2 ? true : false;
		
		//System.out.println("s1==s2 is "+val);
		
		boolean val1= s1==s3 ? true : false;
		//System.out.println("s1==s3 is "+val1);
		
		
		//equals method will compare the content
		
		boolean val3= s1.equals(s3) ? true:false;
		//System.out.println("s1 equals s3 is "+val3);
		
		// string concatenate
		
		String s4 ="chandu is a programmer";
		
      s4 =s4+" in infosys";
      System.out.println(s4);
      
      
      
    s4= s4.concat(" hyderabad");
    System.out.println(s4);
      //indexing 
       
       char ch=s4.charAt(4);
       //System.out.println(ch);
       
     //split
       String s5="infosys pocharam gachibowli";
       
       System.out.println(s5.length());
     
      String s6= s5.substring(s5.lastIndexOf(" ")+1, s5.length());
      System.out.println(s6);
      
      
      
     int secondspace= s5.lastIndexOf(" ");
     System.out.println(secondspace);
		
     
     String s7 = "d/chandu/abc.pdf";
    System.out.println( s7.replace("/", "\\"));
     
    System.out.println(s7.substring(0,s7.indexOf("."))+s7.substring(s7.lastIndexOf("/"), s7.length()));
    
		System.out.println(s7.substring(s7.lastIndexOf("/"), s7.length()));
		
		//replace
		String s8="west side counter";
		
		String s9="west Side counter";
		System.out.println(s9.equalsIgnoreCase(s8));
		
		System.out.println(s8.replace("we", "ea"));
		
		String s10="chandu is java programmerr";
		
		if(s10.contains("chandu")) {
			s10=s10.replace("chandu", "pavan");
		}
		System.out.println(s10);
		
		String s11="west east north south";
		String arr[] =s11.split(" ");
		for(String str : arr) {
			System.out.println(str);
		}
		

	}

}
