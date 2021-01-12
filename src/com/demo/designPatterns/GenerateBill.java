package com.demo.designPatterns;

public class GenerateBill {
	public static void main(String[] args) {
		GetPlanFactory planFactory = new GetPlanFactory();
		Plan plan =planFactory.getPlan("DOMESTICPLAN");
		plan.getRate();
		plan.CaluculateBill(3);
	}
}
