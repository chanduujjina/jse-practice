package com.demo.oops;

public class GearVehicle  extends MotorBike{
	
	



	public int getNumberofGears() {
		return numberofGears;
	}



	public String getGearDirections() {
		return gearDirections;
	}



	public GearVehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public GearVehicle(int numberofGears, String gearDirections,String cc, String model, String vehicleName, String vehicleType) {
		super(cc,model,vehicleName,vehicleType);
		this.numberofGears = numberofGears;
		this.gearDirections = gearDirections;
	}

	private int numberofGears;
	
	private String gearDirections;

}
