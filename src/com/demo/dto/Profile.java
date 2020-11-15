package com.demo.dto;

public class Profile {
	
	@Override
	public String toString() {
		return "Profile [skillset=" + skillset + ", rank=" + rank + ", performance=" + performance + "]";
	}

	public String getSkillset() {
		return skillset;
	}

	public int getRank() {
		return rank;
	}

	public String getPerformance() {
		return performance;
	}

	public Profile(String skillset, int rank, String performance) {
		super();
		this.skillset = skillset;
		this.rank = rank;
		this.performance = performance;
		
	}

	private String skillset;
	
	private int rank;
	
	private String performance;
	
	

}
