package com.demo.execption;

import java.util.ArrayList;
import java.util.List;

public class UserDetaiValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//happy  path
     //validateUserInfo(1,"chandu","PAN102954");
   //wrong scenario1
     //validateUserInfo(-1,"chandu","PAN102954");
   //wrong scenario2
     //validateUserInfo(1,"","PAN102954");
    
    //wrong scenario3
    // validateUserInfo(1,"chandu","");
     //wrong scenario4
     //validateUserInfo(1, "chandu12", "PAN102954");
   //wrong scenario5
    // validateUserInfo(1, "chandu123", "PAN");
		//ResponseInfo info=validateAllUserDetails(1, "chandu", "PAN102954");
		ResponseInfo info=validateAllUserDetails(-1,"chandu","PAN102954");	
		System.out.println(info);
    // System.out.println("validation is success");
	}

	private static void validateUserInfo(int customerid ,String name,String pan) {
		//validate  customer id
		if(customerid<=0) {
			System.out.println("validation is failed  while validating  customer id:"+customerid);
			throw  new ValidationException("customer  id shoulbd be positive(greater than zero)");
			
		}
		//validate name
		if(name.isEmpty()   || !name.matches("^[a-zA-Z]*$")) {
			System.out.println("validation is failed  while validating name:"+name);
			throw  new ValidationException("name sholbd be alphabetic and should not be empty");
		}
		//"^[a-zA-Z0-9]+$"
		if(pan.isEmpty()  ||  !pan.matches("^[a-zA-Z0-9]+$")) {
			System.out.println("validation is failed  while validating pan:"+pan);
			throw  new ValidationException("shuoube be alphanumeric and should not be empty");
		}
		
	}
	
	private static ResponseInfo validateAllUserDetails(int customerid ,String name,String pan) { 
		//validate  customer id 
		ResponseInfo  response =  new ResponseInfo();
		List<ErrorInfo> errorInfoList  =new ArrayList<>();
		ErrorInfo   errorInfo  =null;
		if(customerid<=0) {
			System.out.println("validation is failed  while validating  customer id:"+customerid);
			   errorInfo = new ErrorInfo("cusomerID","validation is failed  while validating  customer id") ;
			   errorInfoList.add(errorInfo);
			
		}
		//validate name
		if(name.isEmpty()   || !name.matches("^[a-zA-Z]*$")) {
			System.out.println("validation is failed  while validating name:"+name);
			 errorInfo = new ErrorInfo("name","validation is failed  while validating name:") ;
			   errorInfoList.add(errorInfo);
		
		}
		//"^[a-zA-Z0-9]+$"
		if(pan.isEmpty()  ||  !pan.matches("^[a-zA-Z0-9]+$")) {
			System.out.println("validation is failed  while validating pan:"+pan);
			errorInfo = new ErrorInfo("pan","validation is failed  while validating pan:") ;
			   errorInfoList.add(errorInfo);
		}
		if(errorInfo!=null) {
			response .setMessage("vlidation failed");
			response .setErrorInfo(errorInfoList);
		}
		else {
			response .setMessage("vlidation is success");
			response .setErrorInfo(null
					);
		}
		return response;
	}

}
