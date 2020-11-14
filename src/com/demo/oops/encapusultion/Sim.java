package com.demo.oops.encapusultion;

import com.demo.dto.Configuration;

public abstract class Sim {
	
	public String getSimSize() {
		return "2*5";
		
	}
	
	public int getOTPToken() {
		return 1234;
	}
	//definition
	 abstract Configuration getSimConfiguration();
}


class Airtel extends Sim{
// implementation
	@Override
	Configuration getSimConfiguration() {
		
		return new Configuration(1, "airtel", "4g");
	}
	
}

class Idea extends Sim{

	@Override
	Configuration getSimConfiguration() {
		
		return new Configuration(2, "idea", "4g");
	}
	
}



