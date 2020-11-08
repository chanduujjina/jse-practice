package com.demo.oops;

public class MotorBike {
	
	public String getCc() {
		return cc;
	}

	public String getModel() {
		return model;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public MotorBike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MotorBike(String cc, String model, String vehicleName ,String vehicleType) {
		
		this.cc = cc;
		this.model = model;
		this.vehicleName =vehicleName;
		this.vehicleType = vehicleType;
	}

	private String cc;
	
	private String model;
	
	private String vehicleName;
	
    private String vehicleType;
	

}
