package com.demo.oops;

public class WithoutGearVehicle extends  MotorBike{
	
	public String getFuelopedirection() {
		return fuelopedirection;
	}
	public String getSeatopenopedirection() {
		return seatopenopedirection;
	}
	public WithoutGearVehicle(String fuelopedirection, String seatopenopedirection , String cc, String model, String vehicleName, String vehicleType) {
		super(cc,model,vehicleName,vehicleType);
		this.fuelopedirection = fuelopedirection;
		this.seatopenopedirection = seatopenopedirection;
	}
	private String fuelopedirection;
	private String seatopenopedirection;

}
