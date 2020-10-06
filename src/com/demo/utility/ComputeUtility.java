package com.demo.utility;

import com.demo.dto.Employee;

public class ComputeUtility {
	
	private static int moderateBMI=5;
	
	
	public int calculateBMI(int height,int weight) {
		int bmi= weight/height;
		return bmi;
	}
	
	public String getResult(int bmi) {
		if(bmi> moderateBMI) {
			return "heavy height";
		}
		else if(bmi<moderateBMI) {
			return "underweight";
		}
		return "good bmi";
	}

}
