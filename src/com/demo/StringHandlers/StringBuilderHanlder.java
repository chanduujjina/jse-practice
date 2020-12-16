package com.demo.StringHandlers;

public class StringBuilderHanlder {
	
	public static void main(String[] args) {
		
		
		//fetch all empployee details
		String allemployeedetails=getDynmicQuery(0,null,null,null);
		System.out.println("query by all:"+allemployeedetails);
		
		//fetch by id
		String byId=getDynmicQuery(1,null,null,null);
		
		System.out.println("query by id:"+byId);	
		
		//fetch by name
		String byName=getDynmicQuery(0,"chandu",null,null);
		System.out.println("query by name:"+byName);	
		
		
		//fetch employee  details by employee id and empname
		String queryBynameandid=getDynmicQuery(1,"chandu",null,null);
		System.out.println("query by id and name:"+queryBynameandid);
		
		
		
	}
	
	private static String getDynmicQuery(int eid,String empName,Double salary,String doj) {
		
		StringBuilder builder = new StringBuilder("select * from employee  ");
		
		if(eid!=0 ||  empName!=null || salary!=null || doj!=null) {
			builder.append("where ");
		}
		int count =0;
		if(eid!=0) {
			count=count+1;
			builder.append("eid="+eid+"");
			
		}
		
		if(empName!=null) {
			count=count+1;
			if(count>1) {
				builder.append(" and " );
			}
			builder.append("empName="+empName+"");
		}
		if(null!=salary) {
			count=count+1;
			if(count>1) {
				builder.append("and" );
			}
			builder.append("salary="+salary+"");
		}
		
		if(null!=doj) {
			count=count+1;
			if(count>1) {
				builder.append("and" );
			}
			builder.append("doj="+doj+"");
		}
		
		return builder.toString();
	}
	
	
	

}
