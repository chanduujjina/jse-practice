package com.demo.designPatterns;

 public abstract class Plan {
	 
	 public double rate;
	 
	 abstract void getRate();
	 
	 public void CaluculateBill(int units) {
		 System.out.println(rate*units);
	 }

}
 
 class DomseticPlan extends Plan{

	@Override
	void getRate() {
		rate=3.15;
		
	}
	 
 }
 
 
 class CommercialPlan extends Plan{

	@Override
	void getRate() {
		rate=7.15;
		
	}
	 
 }

class InstitutionalPlan extends Plan{

	@Override
	void getRate() {
		rate=5.15;
		
	}
	
}

class GetPlanFactory{
	public Plan getPlan(String planType) {
		if(planType.equals("DOMESTICPLAN")) {
			return new DomseticPlan();
		}
		else if(planType.equals("COMMERCIALPLAN")) {
			return new CommercialPlan();
		}
		else if(planType.equals("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}

