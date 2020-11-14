package com.demo.dto;

public class Configuration {
	
	@Override
	public String toString() {
		return "Configuration [networkId=" + networkId + ", networkName=" + networkName + ", configuration="
				+ configuration + "]";
	}

	public int getNetworkId() {
		return networkId;
	}

	public String getNetworkName() {
		return networkName;
	}

	public String getConfiguration() {
		return configuration;
	}

	public Configuration(int networkId, String networkName, String configuration) {
		super();
		this.networkId = networkId;
		this.networkName = networkName;
		this.configuration = configuration;
	}

	private int networkId;
	
	private String networkName;
	
	private String configuration;
	
	

}
